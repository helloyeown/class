

-- DEPT MANAGER

-- 1.List 출력
select * from dept;

-- 2.search 검색
--select * from dept where deptno=?;
select * from dept where dname like '%?%';
select * from dept where dname='?';

-- 3.insert 추가
insert into dept values(50,'Test','Seoul');
-- insert into dept values(?, ?, ?);
rollback;

-- 4.update 수정
update dept set dname='aaa', loc='bbb' where deptno=60;
-- update dept set dname=?, loc=? where deptno=?;

-- 5.delete 삭제
delete from dept where deptno=60;
--delete from dept where deptno=?

rollback;