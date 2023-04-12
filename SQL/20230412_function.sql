
-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일행 함수 / 집합(그룹) 함수
-- 단일행 함수: 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수
-- abs: 절대값 반환
select 10, -10, abs(-10), abs(10) from dual;

-- floor: 소수점 절사
select 2.1, 2.9, floor(2.1), floor(2.9) from dual;

-- round: 지정 위치에서 반올림
select 1234.567, round(1234.567), round(1234.567, 1),
round(1234.567, -1) from dual;

-- trunc: 특정 자릿수에서 절사(버림)
select 1234.567, trunc(1234.567), trunc(1234.567, 1),
trunc(1234.567, -2) from dual;

-- mod: 나머지 연산, 0으로 나눌 때 주의(오른쪽)
-- 출력값: 1, 2, 0, 3(주의)
select mod(1,3), mod(2,3), mod(0,3), mod(3,0) from dual;



-- 문자 함수
-- lower: 소문자로 전환
-- upper: 대문자로 전환
select 'SCOTT', lower('SCOTT') from dual;
select dname, lower(dname) from dept;
select 'scott', upper('scott') from dual;
select initcap('scott') from dual;

-- substr(원본, 시작위치), substr(원본, 시작위치, 반환할 문자 갯수)
-- :문자열 잘라서 추출
-- 자바는 zero index 이지만 sql은 1부터 시작
select '안녕하세요. 문예원입니다.', substr('안녕하세요. 문예원입니다.', 5),
substr('안녕하세요. 문예원입니다.', 2, 8)
from dual;

-- length(원본 문자열): 문자열의 갯수 반환
select length('안녕하세요') from dual;

-- lapd(왼쪽), rpad(오른쪽)
-- 문자열에서 자리수를 지정하고 자리에 데이터가 없을 때 패턴을 입력
select '10', lpad('10', 10, '0'), rpad('11', 5, '*') from dual;
select deptno, lpad(deptno, 5, '0') from dept;

-- trim: 좌우 공백 제거
select '     ABC     ', trim('     ABC     '), trim('     ABC')
from dual;

-- replace(원본, 치환하고 싶은 부분, 치환값)
select 'Steven King', replace('Steven King', 'Steven', 'S. '),
replace('Steven King', 'Steven ', '')
from dual;


-- 날짜 함수
-- sysdate: 현재 날짜
select sysdate from dual;

-- months_between(날짜, 날짜)
-- : 사이에 기간이 얼마나 남았는지
select sysdate, months_between('23/12/12', sysdate) from dual;

-- add_months(날짜, 달) : 기간으로부터 n개월 전후의 날짜
select add_months(sysdate, 8),
add_months(sysdate, -3)  
from dual;

-- next_day(날짜, 요일): 돌아오는 주의 요일 index
select next_day(sysdate, 1) from dual;

-- last_day: 해당 월의 마지막 날짜
select last_day(sysdate) from dual;

-- round: 특정 날짜에서 시간을 반올림(12시 기준)
-- trunc: 절사
select round(sysdate) from dual;
select trunc(sysdate) from dual;



-- 변환 함수
-- DATE -> CHAR
-- to_char(원본, '패턴')
select sysdate,
        to_char(sysdate, 'yyyy-mm-dd'),
        to_char(sysdate, 'yyyy.mm.dd'),
        to_char(sysdate, 'yyyy-mm-dd day'),
        to_char(sysdate, 'yyyy.mm.dd. hh24:mi:ss')
from dual;

-- number -> char
select 123456789, 
to_char(123456789, '000000000000'),
-- 앞 빈자리를 0으로 채움
to_char(123456789, '000,000,000,000'),
to_char(123456789, '999,999,999,999'),
-- 9를 쓰면 빈자리에 9 채워지지 않음
to_char(123456789, 'L999,999,999,999'),
-- 원화 표현
to_char(123456789, '999,999')
-- 자리수가 맞지 않으면 모두 #으로 표현
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSal
from emp;


-- char -> date
-- TO_DATE('문자열', '패턴'): 날짜 변환
select *
from emp
where hiredate = to_date('1981.02.20', 'yyyy.mm.dd');
--to_date('02198120', 'mmyyyydd');

-- 행 삽입
insert into emp values(9999, 'YEWON', 'MANAGER', 
7782, TO_DATE('04-2023-12', 'MM-YYYY-DD'), 4000, NULL, 10);
SELECT * FROM EMP;
ROLLBACK;   -- 마지막 COMMIT 시점으로 복귀


-- CHAR -> NUMBER
-- TO_NUMBER('문자열', '패턴') -> 숫자 타입
SELECT '20000' - '10000'    -- 자동형변환
FROM DUAL;

SELECT '20,000' - '10,000'
FROM DUAL;

SELECT TO_NUMBER('20,000', '999,999,999') - TO_NUMBER('10,000', '99,999')
FROM DUAL;


-- decode 함수: 동등비교 연산 후 결과를 출력 (switch문과 유사)
select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS') AS DNAME
from emp ORDER BY DEPTNO;


--직급에 따라 급여를 인상하도록 하자. 직급이 'ANAlYST'인 사원은 5%, 'SALESMAN'인 사원은 10%, 
--'MANAGER'인 사원은 15%, 'CLERK'인 사원은 20%인 인상
select ename, job, sal,
        NVL(decode(job,
                'ANALYST', SAL*1.05,
                'SALESMAN', SAL*1.1,
                'MANAGER', SAL*1.15,
                'CLERK', SAL*1.2
                ), SAL) AS UPSAL
FROM EMP ORDER BY SAL;


-- CASE
select ename, deptno,
        decode(deptno,
                10, 'ACCOUNTING',
                20, 'RESEARCH',
                30, 'SALES',
                40, 'OPERATIONS') AS DNAME,
                CASE WHEN DEPTNO=10 THEN 'ACCOUNTING'
                    WHEN DEPTNO=20 THEN 'RESEARCH'
                    WHEN DEPTNO=30 THEN 'SALES'
                    ELSE 'OPERATIONS'
                END AS DNAME2
from emp ORDER BY DEPTNO;




-- 그룹 함수, 집합 함수, 집계 함수, 다중행 함수
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- SUM, AVG, COUNT, MAX, MIN

-- 급여 총액
SELECT SUM(SAL), TO_CHAR(SUM(SAL), 'L999,999')
FROM EMP;

-- COMM 총합
SELECT SUM(COMM), COUNT(COMM), AVG(COMM)
-- 값이 NULL인 경우 연산 대상에서 제외시키고 연산
FROM EMP;
SELECT COMM FROM EMP WHERE COMM IS NOT NULL;

-- 평균 급여
SELECT AVG(SAL), TRUNC(AVG(SAL)), ROUND(AVG(SAL),2)
FROM EMP;

-- 최고 급여 MAX, 최저 급여MIN
SELECT MAX(SAL), MIN(SAL)
FROM EMP;

-- COUNT : ROW 갯수
-- 전체 사원 수
SELECT COUNT(*)
FROM EMP;
-- 10번 부서 사원 수
SELECT COUNT(*) FROM EMP WHERE DEPTNO=10;
-- 부서의 갯수
SELECT COUNT(DEPTNO) FROM DEPT;
-- 직급 갯수
SELECT COUNT(DISTINCT JOB) FROM EMP ORDER BY JOB;



-- GROUP BY: 행 단위로 그룹핑
SELECT DEPTNO, 
    COUNT(*) AS "사원의수", 
    SUM(SAL) AS "총급여액",
    TRUNC(AVG(SAL)) AS "평균급여액",
    MAX(SAL) AS "최고급여액",
    MIN(SAL) AS "최소급여액",
    COUNT(COMM) AS "커미션을받는사원수"
FROM EMP
GROUP BY DEPTNO
-- 그룹별 평균 급여가 2000 이상인
--HAVING AVG(SAL)>=2000
-- 그룹핑 된 데이터의 집합 함수 결과를 조건식으로 만들 때
-- 총 급여액이 10000을 넘는 그룹
HAVING SUM(SAL)>=10000
ORDER BY DEPTNO;

SELECT JOB, COUNT(*), TRUNC(AVG(SAL)), SUM(SAL), MAX(SAL), MIN(SAL),
        MAX(SAL)-MIN(SAL)
FROM EMP 
GROUP BY JOB;


