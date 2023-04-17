
-- sub query test slove

--43. 사원 번호가 7788인 사원과 "담당 업무"가 같은 사원을 
--표시(사원 이름과 담당업무)하시오.
select ename, job from emp where job = (select job from emp where empno=7788);
-- join
select * from emp e1, emp e2 where e2.empno=7788 and e1.job=e2.job;



--44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 담당 업무
select ename, job from emp where sal > (select sal from emp where empno=7499);



--45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select ename, job, sal from emp where sal = (select min(sal) from emp);



--46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
--직급별 평균 => group by 
select job, avg(sal) from emp group by job 
having avg(sal)=
    (select min(avg(sal)) 
    from emp group by job);
-- 직급별 최저 평균 급여
select min(avg(sal)) from emp group by job;


-- ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ
--47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select * from emp e, (select deptno, min(sal) as minsal from emp group by deptno) m
where e.deptno=m.deptno and e.sal=m.minsal;

select deptno, min(sal) from emp group by deptno;


--48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서 
--업무가 ANALYST가 아닌 사원들을 
--표시(사원번호, 이름, 담당 업무, 급여)하시오.
select * from emp
where job != 'ANALYST'
        and sal < 
            all(select distinct sal 
            from emp 
            where job = 'ANALYST');
            

--49. 부하직원이 없는 사원의 이름을 표시하시오.
-- 나의 사원번호가 다른 사원 mgr에 있다면 => 나는 관리자, 부하직원이 있다
-- 나의 사원번호가 다른 사원 mgr에 없다면 => 부하직원 X
select ename from emp
where empno not in (select distinct mgr from emp where mgr is not null);

select distinct mgr from emp where mgr is not null;
-- 상관 번호


--50. 부하직원이 있는 사원의 이름을 표시하시오.
select ename from emp
where empno in (select distinct mgr from emp where mgr is not null);


--51. BLAKE와 동일한 부서에 속한
--사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )
select deptno from emp where ename='BLAKE';

select ename, hiredate from emp
where deptno = (select deptno from emp where ename='BLAKE')
        and ename!='BLAKE';
        
        
--52. 급여가 평균 급여보다 많은 사원들의 
--사원 번호와 이름을 표시하되 
--결과를 급여에 대해서 오름차순으로 정렬하시오.
select avg(sal) from emp;

select deptno, ename from emp where sal > (select avg(sal) from emp)
order by sal;


--53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원 번호와 이름을 표시하시오.
select distinct deptno from emp where ename like '%K%';

select empno, ename from emp 
where deptno in 
        (select distinct deptno 
        from emp 
        where ename like '%K%');
        
        
--54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
-- 부서위치가 dallas인 부서번호
select deptno from dept where loc='DALLAS';

select ename, deptno, job from emp 
where deptno = (select deptno from dept where loc='DALLAS');


--55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
-- emp -> mgr(상사) -> 사원의 mgr 컬럼에 king의 empno를 갖고있는 사원
select empno from emp where ename = 'KING';

select ename, sal from emp 
where mgr = (select empno from emp where ename = 'KING');


--56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
select deptno from dept where dname = 'RESEARCH';

select deptno, ename, job from emp
where deptno = (select deptno from dept where dname = 'RESEARCH');


--57. 평균 월급보다 많은 급여를 받고 
--이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 
--사원 번호, 이름, 급여를 표시하시오.
select avg(sal) from emp;   --평균급여
select distinct deptno from emp where ename like '%M%';

select empno, ename, sal from emp where sal > (select avg(sal) from emp)
        and deptno in 
            (select distinct deptno 
            from emp 
            where ename like '%M%');


--59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.
select deptno from emp where job = 'MANAGER';

select * from emp where deptno in 
        (select deptno from emp where job = 'MANAGER');






--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(5) 박지성이구매한도서의출판사수
--서브 쿼리
select bookid from orders where custid=1;
select count(publisher) from book where bookid in (select bookid from orders where custid=1);

--join
select distinct count(b.publisher) from orders o, book b, customer c
where o.bookid=b.bookid and
        o.custid=c.custid
        and c.name='박지성';


--(6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select name, bookname, price, price-saleprice as gap
from orders o, customer c, book b
where o.bookid=b.bookid and c.custid=o.custid and name = '박지성';


--(7) 박지성이구매하지않은도서의이름
-- 박지성이 구매한 도서의 bookid
select distinct bookid from orders o, customer c
where o.custid=c.custid and c.name = '박지성';

select bookname from book
where bookid not in (select distinct bookid from orders o, customer c
                    where o.custid=c.custid and c.name = '박지성');



--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--(8) 주문하지않은고객의이름(부속질의사용)

select * from orders o, customer c
where o.custid=c.custid;

-- 구매한 고객의 고객번호
select name from customer
where custid not in (select distinct custid from orders);

-- exist() : 셀렉의 결과가 하나라도 있으면 참, 상관관계 있어야 함
select * from customer c
where not exists (select * from orders o where c.custid=o.custid);



--(9) 주문금액의총액과주문의평균금액
select sum(saleprice), avg(saleprice) from orders;


--(10) 고객의이름과고객별구매액
-- group by, c.custid, c.name
-- 1. join
-- 2. group by => 컬럼 2개 사용(name은 중복 될 수 있기 때문에)
select c.name, sum(saleprice) as total
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
order by c.custid;


--(11) 고객의이름과고객이구매한도서목록
select c.name, b.bookname
from orders o, customer c, book b
where o.bookid=b.bookid
        and o.custid=c.custid;


--(12) 도서의가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
-- 정가-판매가 => 최대 차이
select max(price-saleprice)
from orders o, book b
where o.bookid=b.bookid;

select o.orderid, b.price, o.saleprice, price-saleprice as gap
from orders o, book b
where o.bookid=b.bookid and
        price-saleprice =
        (select max(price-saleprice)
        from orders o, book b
        where o.bookid=b.bookid);


--(13) 도서의판매액평균보다자신의구매액평균이더높은고객의이름
-- 고객별 총 판매액 출력 -> 조건: 총 평균보다 더 높은 고객만
select avg(saleprice) from orders;

select c.custid, c.name, avg(o.saleprice)
from orders o, customer c
where o.custid=c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid;


--3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
--(1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select distinct publisher from orders o, book b, customer c
where o.bookid=b.bookid and
        c.custid=o.custid and
        name='박지성';
        
select name
from customer c, orders o, book b
where c.custid=o.custid and
        b.bookid=o.bookid and
        publisher in (select distinct publisher 
            from orders o, book b, customer c
            where o.bookid=b.bookid and
            c.custid=o.custid and
            name='박지성') and
        name!='박지성';
        
    
--(2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- group by custid, name
-- 고객별 구매한 도서의 출판사의 수
-- join으로 처리
select c.custid, name, count(distinct b.publisher)
from customer c, orders o, book b
where c.custid=o.custid and
        o.bookid=b.bookid
group by c.custid, name
having count(distinct publisher) > 1;

-- 서브쿼리
-- 2개 이상 출판사의 책을 구매한 회원 id
select o.custid
from orders o, book b
where o.bookid=b.bookid
group by o.custid
having count(distinct publisher) > 1
;

select * from customer
where custid in (select o.custid
        from orders o, book b
        where o.bookid=b.bookid
        group by o.custid
        having count(distinct publisher) > 1);

