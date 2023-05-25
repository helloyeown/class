CREATE TABLE `empmember` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(45)  NOT NULL,
  `pw` varchar(45) NOT NULL,
  `uuid` varchar(45) DEFAULT NULL,
  `uname` varchar(45) NOT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`uid`)
);


select * from empmember;

insert into empmember (uid, pw, uname) values ('moon', 1234, 'moon');

select idx, uid, uname from empmember where uid='hot' and pw=1111;