

-- 전화번호 저장 테이블
create table phoneinfo_basic (
    idx number(6) CONSTRAINT PK_BASIC_IDX primary key not null,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

create table phoneinfo_univ (
    idx number(6) CONSTRAINT PK_UNIV_IDX primary key,
    fr_u_major varchar2(20) default 'N',
    fr_u_year number(1) default 1 check (0< fr_u_year and fr_u_year<5),
    fr_ref number(7) constraint FK_UNIV_REF not null 
        references PHONEINFO_BASIC(idx)
);

create table phoneinfo_com(
    idx number(6) constraint PK_COM_IDX PRIMARY KEY,
    fr_c_company varchar2(20) default 'N',
    fr_ref number(6) not null references phoneinfo_basic(idx)
);



--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneinfo_basic (idx, fr_name, fr_phonenumber)
values (1, 'YEWON', '01000001234');

select * from phoneinfo_basic;

update phoneinfo_basic set fr_phonenumber='01012345678' where idx=1;

delete from phoneinfo_basic where idx=1;


--2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneinfo_univ values(1, null, null, 1);

select * from phoneinfo_univ;

update phoneinfo_univ set idx=2;

delete from phoneinfo_univ where idx=2;


--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
insert into phoneinfo_com (idx, fr_ref)values (8,1);
insert into phoneinfo_com (idx, fr_ref)values (10,1);
insert into phoneinfo_com values (9,'',1);

select * from phoneinfo_com order by idx;

delete from phoneinfo_com where idx=8;

update phoneinfo_com set idx=8 where idx=10;