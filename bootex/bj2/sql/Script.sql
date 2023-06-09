create table tbl_todo (

   tno int auto_increment primary key,
   title varchar(500) not null,
   content varchar(1000) not null,
   writer varchar(100) not null,
   complete tinyint default 0,
   dueDate date
)
;

select * from tbl_todo
where tno>0
order by tno desc
limit 10,20;

-- select * from tbl_todo order by tno desc;

insert into tbl_todo (title, content, writer, dueDate)
values ('Title', 'Content', 'user', '2023-06-30')
;

select count(*)
from
	(select tno from tbl_todo 
        where tno>0 limit 80) todo;

select count(*) from tbl_todo;

insert into tbl_todo (title, content, writer, dueDate)
select title, content, writer, dueDate from tbl_todo
;

update tbl_todo
   set
      title = concat(title, tno),
      content = concat(content, tno),
      writer = concat(writer, mod(tno, 100)),
      dueDate = DATE_ADD(dueDate, interval mod(tno, 100) day)
where tno > 1000
;

select * from tbl_todo where tno > 700 and tno <800;

-- full scan 방식
select * from tbl_todo order by tno + 1000 desc
;

select * from tbl_todo
where writer = 'user96'
order by tno desc
;

-- 사용자 정의 인덱스

create index idx_writer on tbl_todo (writer asc);

-- null은 인덱스를 잡을 수 없음 (not null 조건 쓰는 이유)

select * from tbl_todo 
where 
   content like '%12345%'
   and tno>0
order by tno desc
limit 90000, 20
;