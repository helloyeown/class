
-- 2023.04.11
-- select

-- 로그인 한 사용자가 소유하고 있는 테이블의 정보
select * from tab;

-- 테이블 정보 확인
DESCRIBE emp;
desc dept;


-- 데이터 추출하는 질의어: select
-- select 컬럼이름, 컬럼이름, 컬럼이름 ... from 테이블이름; (VIEW 사용 가능)
-- select * from 테이블이름; (전체 컬럼 가져옴)

select * from dept; -- 키워드, 객체 이름은 대소문자 상관X
SELECT * FROM DEPT;

-- 특정 컬럼의 데이터만 검색
SELECT DNAME, DEPTNO, LOC  -- DNAME, DEPTNO, LOC 추출, 순서 상관x
FROM DEPT   -- 컬럼 순서 내가 정의한대로 질의 결과 출력
;   -- SELECT의 결과는 새로운 테이블




-- 산술연산자
-- SELECT 구문의 프리젠테이션 영역에 컬럼 뿐 아니라 연산(함수)의 결과를 새로운 컬럼으로 출력
SELECT SAL, SAL+100, SAL-100, SAL*10, SAL/2 FROM EMP;
SELECT SAL + 100 FROM EMP;  -- 모든 행에 +100 (컬럼 이름은 SAL+100)
SELECT SAL-100 FROM EMP;
SELECT SAL*10 FROM EMP;
SELECT SAL/2 FROM EMP;

-- 사원 테이블에서 사원의 이름과 급여, 연봉계산결과(*12+상여500) 출력
SELECT ENAME, SAL, SAL*12+500
FROM EMP;

-- 상여금 계산-> SAL*12+(컬럼 커미션)COMM
SELECT SAL, COMM, SAL*12+COMM   -- NULL을 연산하면 NULL이 나옴(원치 않은 결과)
FROM EMP;

-- 이를 해결하기 위해 함수 사용
-- nvl(null value)을 특정 값으로 치환
-- nvl(컬럼, 치환값) : 치환값은 컬럼의 타입에 맞는 데이터를 넣어야 함
-- comm의 null 값을 0으로 치환
select sal, comm, nvl(comm,0), sal*12+nvl(comm,0)
from emp;

-- as : 컬럼의 이름에 별칭 부여
-- 컬럼 뒤에 as 키워드를 쓰고 별칭 작성
-- 한글, 띄어쓰기 쓸 땐 ""로 묶어주기 (잘 안 씀)
select sal, comm, nvl(comm,0) as comm1, sal*12+nvl(comm,0) as "year Sal"
from emp;

-- 문자열 || 문자열: 문자열 붙이기
select ename || ' is a ' || job
from emp;

-- select [distinct] from ...
-- : 중복값 제거하고 값을 하나만 출력
select deptno from emp; -- 각 사원들이 소속된 부서 번호 출력
select distinct deptno from emp; -- 부서 하나씩만 출력
select job from emp; -- 모든 사원의 각 직급 출력
select distinct job from emp; -- 직급이 하나씩만 출력




-- where
-- 원하는 행을 검색
-- select ... from ... where 조건식;
-- 급여가 3000 이상인 사원 정보 리스트 추출
SELECT * from emp where sal >= 3000;

-- = : 컬럼의 데이터를 같은지 비교
-- 10번 부서에 소속된 사원들의 정보 출력
select ename, job from emp where deptno=10;

--이름이 FORD인 사원의 사원번호(EMPNO)과 사원이름(ENAME)과 급여(SAL)을 출력
-- 문자열 비교: 작은 따옴표 사용, 대소문자 구분해야 함
select EMPNO, ENAME, SAL
from emp
where ename='FORD';

-- 날짜를 비교할 때에도 작은 따옴표 사용
SELECT *
FROM EMP
WHERE hiredate = '81/12/03';

SELECT *
FROM EMP
WHERE hiredate > '81/12/03';

-- 논리연산자 : and, or, not
-- 10번 부서의 매니저 정보 출력
select * from emp where deptno=10 and job='MANAGER';
select * from emp where DEPTNO=20 OR DEPTNO=30 OR DEPTNO=40;
SELECT * FROM EMP WHERE NOT DEPTNO=10;
SELECT * FROM EMP WHERE DEPTNO<>10;
SELECT * FROM EMP WHERE DEPTNO!=10;

--2000에서 3000 사이의 급여를 받는 사원(A 이상 B 이하)
SELECT * FROM EMP WHERE SAL>=2000 AND SAL<=3000;
--범위연산자 BETWEEN A AND B : A이상 B이하
SELECT * FROM EMP WHERE SAL BETWEEN 2000 AND 3000;
--날짜도 가능, 날짜는 작은 따옴표
--1987년에 입사한 사원 -> '87/01/01' ~ '87/12/31'
SELECT * FROM EMP WHERE HIREDATE BETWEEN '87/01/01' AND '87/12/31';

--10번,20번,30번 부서에 소속한 사원의 정보 출력
SELECT * FROM EMP WHERE DEPTNO=10 OR DEPTNO=20 OR DEPTNO=30;
--컬럼 IN(값1, 값2...): OR의 연산을 간단하게 처리
--컬럼=값1 OR 컬럼=값2 OR 컬럼=값3
SELECT * FROM EMP WHERE DEPTNO IN(10,20,30);

-- 패턴 검색 : 문자열의 패턴 -> 컬럼 LIKE '패턴';
--패턴 형식 : %(0개 이상) '%JAVA%' 자바 문자열을 포함
--_한자리 __두자리 ___세자리 -> '__A' 앞 두자리 아무거나O, A로 끝나는 세 자리 문자열

-- F로 시작하는 이름의 사원 리스트
SELECT * FROM EMP WHERE ename LIKE 'F%';
-- 이름에 A를 포함하는 사원 리스트(검색)
SELECT * FROM EMP WHERE ENAME LIKE '%A%';
-- 이름이 N으로 끝나는 사원 리스트(확장자)
SELECT * FROM EMP WHERE ENAME LIKE '%N';
-- 사원 이름 중 두 번째 문자가 'A'
select * from emp where ename like '_A%';
-- 끝에서 두 번째가 R
select * from emp where ename like '%R_';

-- NOT
-- 이름에 A를 포함하지 않는 사원 리스트(검색)
SELECT * FROM EMP WHERE ENAME NOT LIKE '%A%';
SELECT * FROM EMP WHERE DEPTNO NOT IN(10,20);
SELECT * FROM EMP WHERE HIREDATE NOT BETWEEN '87/01/01' AND '87/12/31';

--IS NULL, IS NOT NULL : NULL 여부 판단
-- 커미션이 등록되지 않은 사원 리스트
SELECT * FROM EMP WHERE COMM IS NULL;
-- 커미션이 등록 되어있는 사원 리스트
SELECT * FROM EMP WHERE COMM IS NOT NULL;
-- 커미션을 받는 사원 리스트
SELECT * FROM EMP WHERE COMM>0 AND COMM IS NOT NULL;
SELECT * FROM EMP WHERE NOT(COMM=0 OR COMM IS NULL);

--ORDER BY: 정렬 (오름차순 ASC, 내림차순 DESC)
-- SELECT... FROM... WHERE ... ORDER BY 컬럼이름 ASC OR DESC
-- ASC는 생략 가능(기본값)
-- 급여순으로 사원 리스트 출력
SELECT * FROM EMP ORDER BY SAL ASC;
SELECT * FROM EMP ORDER BY SAL;
SELECT * FROM EMP ORDER BY SAL DESC;

-- 문자 정렬(이름순)
SELECT * FROM EMP ORDER BY ENAME;
SELECT * FROM EMP ORDER BY ENAME DESC;

-- 날짜(최근이 큼)
-- 입사일이 빠른 순서대로 정렬
SELECT * FROM EMP ORDER BY hiredate;
-- 최근 입사일 기준으로 정렬
SELECT * FROM EMP ORDER BY hiredate DESC;

-- 급여순으로 정렬하고 같으면 이름으로 내림차순 정렬
SELECT * FROM EMP ORDER BY SAL, ENAME DESC;