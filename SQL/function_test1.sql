SELECT * FROM EMP;
--16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
SELECT SUBSTR(HIREDATE, 1,5)
FROM EMP;

--17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
select ename from emp where substr(hiredate, 4, 2) = 04;

--18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
select ename, empno from emp where mod(empno,2)=0;

--19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 
--요일은 약어 (DY)로 지정하여 출력하시오.
select hiredate, to_char(hiredate, 'yy mm dy')
from emp;

--20. 올해 몇 칠이 지났는지 출력하시오. 현재날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
--TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
select round(sysdate -to_date(230101,'yymmdd')) as diffDate
from dual;


--21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
SELECT ename, nvl(mgr,0) FROM EMP;

--22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 직급이 ‘ANALIST”인 사원은 200, 
--‘SALESMAN’인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오.
select ename, job, sal, 
            NVL(decode( JOB,
            'ANALIST',SAL+200,
            'SALESMAN',SAL+180,
            'MANAGER',SAL+150,
            'CLERK',SAL+100
                ),SAL) AS "인상"
FROM EMP;

--23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 
--평균에 대해서는 정수로 반올림하시오.
SELECT MAX(SAL), MIN(SAL), ROUND(AVG(SAL))
FROM EMP;

​
--24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오.
--평균에 대해서는 정수로 반올림 하시오.
SELECT MAX(SAL), MIN(SAL), ROUND(AVG(SAL))
FROM EMP
GROUP BY JOB;

--25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.
SELECT COUNT(*) FROM EMP
GROUP BY JOB;

--26. 관리자 수를 출력하시오.
SELECT COUNT(*) FROM EMP 
GROUP BY JOB HAVING JOB='MANAGER';

--27. 급여 최고액, 급여 최저액의 차액을 출력하시오.
select max(sal)-min(sal) from emp;

--28. 직급별 사원의 최저 급여를 출력하시오. 관리자를 알 수 없는 사원과 최저 급여가
--2000 미만인 그룹은 제외시키고 결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.
select job, min(sal)
from emp
where mgr is not null
group by job
having min(sal)>=2000
order by min(sal) desc;



--29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오.
--평균 급여는 소수점 둘째 자리로 반올림 하시오.
select deptno, count(ename), round(avg(sal), 2)
from emp
group by deptno
order by deptno;

--30. 각 부서에 대해 부서번호 이름, 지역 명, 사원 수, 부서내의
--모든 사원의 평균 급여를 출력하시오. 평균 급여는 정수로 반올림 하시오. DECODE 사용.
SELECT DECODE( DEPTNO,
        10, '부서1',
        20, '부서2',
        30, '부서3',
        40, '부서4'),
        DECODE (DEPTNO,
        10, 'NEW YORK',
        20, 'DALLAS',
        30, 'CHICAGO',
        40, 'BOSTON'),
        COUNT(ENAME), ROUND(AVG(SAL))
FROM EMP
GROUP BY DEPTNO;