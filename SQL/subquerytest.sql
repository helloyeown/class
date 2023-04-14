-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오
select ename, job from emp where job in (select job from emp where empno=7788);

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무
select ename, job from emp where sal > (select sal from emp where empno=7499);

-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select ename, job, sal from emp where sal = (select min(sal) from emp);

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균을 구하시오.
SELECT job, AVG(sal)
FROM emp
GROUP BY job
HAVING avg(sal) = (
  SELECT MIN(avg_sal) 
  FROM (SELECT job, AVG(sal) AS avg_sal FROM emp GROUP BY job) t);

-- ​47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select ename, sal, deptno from emp where deptno = (select deptno from emp where min(sal) group by deptno);