CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
) ;



-- DML insert
INSERT INTO tbl_todo (todo, duedate) VALUES ('JSP 공부', '2023-05-05');
-- INSERT INTO tbl_todo (todo, duedate) VALUES (?, ?);

-- DML update
update tbl_todo set todo='청소', duedate='2023-05-03' where tno=2;
-- update tbl_todo set todo=?, duedate=? where tno=?;

-- DML delete
delete from tbl_todo where tno=8;
-- delete from tbl_todo where tno=?;

-- DQL select
-- list
select * from tbl_todo;
-- 상세보기 view, 수정 update-view
select * from tbl_todo where tno=2;
-- select * from tbl_todo where tno=?;