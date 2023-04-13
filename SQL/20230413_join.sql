
-- 2023. 04. 03
-- join

-- cross join
-- 스키마를 붙이고 결과 행은 모든 경우의 수 반환 -> n*m
-- emp, dept -> 14*4 -> 56개 행


select *
from emp cross join dept;

select *
from emp inner join dept
on emp.deptno=dept.deptno;

select *
from emp join dept
on emp.deptno=dept.deptno;

select deptno
from emp natural join dept;
-- 같은 이름의 컬럼이 있는 경우 중복 없앰

select *
from emp join dept
using(deptno);
-- natural join과 같은 역할 (중복 없앰)





-- equi join
select *
from emp, dept
where emp.deptno = dept.deptno;




select empno, e.deptno, d.deptno
from emp e, dept d
where e.deptno = d.deptno;


--이름이 SCOTT인 사람의 부서명을 출력해봅시다
select deptno from emp where ename='SCOTT';
--20
select dname from dept where deptno=20;
--research
--> join으로 해결
select ename, dname
from emp e, dept d
where e.deptno = d.deptno
        and ename='SCOTT';
        
        
-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and hisal;


-- self join: 자기 자신의 테이블을 join하는 경우
-- 각 사원의 이름과 각 사원의 매니저 이름 출력
select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno
;

-- outer join : 조건에 만족하지 않는 행도 출력
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr=m.empno(+)
;

select *
from emp e join emp m
on e.mgr=m.empno;


select *
from emp e left outer join emp m
on e.mgr=m.empno;



-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, saleprice, orderdate
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid
;