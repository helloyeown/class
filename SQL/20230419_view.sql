

-- 2023.04.19

-- view : 가상테이블
-- view 객체는 sql을 가진다 -> sql 실행결과를 가상의 테이블로 사용

select empno, ename, deptno 
from emp 
where deptno=30;

-- view 객체 생성
-- create or replace view 뷰이름 as 서브쿼리
create or replace view emp_view30
as
select empno, ename, deptno 
from emp 
where deptno=30;

select * from emp_view30;

-- 주문정보 : orders, book, customer
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate
from orders o, book b, customer c
where o.custid=c.custid and b.bookid=o.bookid;

-- view 생성
create or replace view order_info
as
select o.orderid, c.name, b.bookname, b.price, o.saleprice, o.orderdate, c.phone
from orders o, book b, customer c
where o.custid=c.custid and b.bookid=o.bookid;

select name, bookname from order_info where name='박지성';

-- view 정보 확인
select view_name, text from user_views;


-- view 삭제
drop view emp_view30;


--사원 중에서 입사일이 빠른 사람 5명(TOP-5)
select rownum, ename, hiredate from emp order by hiredate;
-- rouwnum : 입력순서대로 부여 -> hiredate순으로 나오지 않음

select rownum, ename, hiredate 
from (select rownum, ename, hiredate from emp order by hiredate)
where rownum<=3
order by hiredate;
-- rownum이 hiredate 순서대로 부여 (rownum이 재정렬 된 결과)

create or replace view emp_hiredate_view
as
select ename, hiredate from emp order by hiredate;  -- rownum 빼고 만들기

select rownum, ename, hiredate from emp_hiredate_view
where rownum<=3;

select to_char(hiredate,'yyyy') from emp;







