CREATE TABLE `member` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `uid` varchar(45)  NOT NULL,
  `pw` varchar(45) NOT NULL,
  `uuid` varchar(45) DEFAULT NULL,
  `uname` varchar(45) NOT NULL,
  `uphoto` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idx`),
  UNIQUE KEY `uid_UNIQUE` (`uid`)
);

-- insert
INSERT INTO `member`
(`uid`, `pw`, `uname`, `uphoto`) VALUES ('cool', '1111', 'COOL', 'photo.jpg');

-- INSERT INTO `member` (uid, pw, uname, uphoto) VALUES (?, ?, ?, ?)

-- select : 로그인 처리 -> uid, pw 비교해서 질의alter
select * from member where uid = 'cool' and pw = '1111';

-- MemeberDTO 데이터 저장
select idx, uid, uname, uphoto from member where uid='cool' and pw='1111';
-- select idx, uid, uname, uphoto from member where uid = ? and pw = ?