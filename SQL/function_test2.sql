--1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
select sum(saleprice)
from orders
where custid=1
group by custid;


--(4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
select count(*)
from orders
where custid=1
group by custid;


--2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
--
--(1) 마당서점도서의총개수
select count(bookid)
from book;

--(2) 마당서점에도서를출고하는출판사의총개수
select count(distinct publisher)
from book;