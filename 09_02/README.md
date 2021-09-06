# 09_02 수업정리

## 용어 정리 
	VT 버츄얼 테이블 - 가상의 테이블 - 정식명칭 인라인 뷰


----
## 테이블 목록 보기 
```sql
select * from TAB;
```
---------------------------------------------------------------------

# SQL :: part 3

## join : non-equi join 이용 이름 ,월급, 월급등급 조회   
==>이름, 월급 : c_emp / 월급등급 : sal_grade
```sql
SELECT
c.name 이름 , c.salary 월급 , sg.grade 월급등급
FROM c_emp c , sal_grade sg 
WHERE c.salary BETWEEN sg.losal AND sg.hisal;
```

개발부 직원과 영업부직원 이름 , 월급 , 월급등급 , 부서명 조회  
    => 등급 높은순  ( NON-EQUI JOIN /  EQUI JOIN 같이 사용)
```sql
SELECT
c.name 이름 , c.salary 월급 , sg.grade 월급등급 , s.dept_name 부서명
FROM c_emp c , sal_grade sg , s_dept s
WHERE c.dept_id = s.id AND c.salary BETWEEN sg.losal AND sg.hisal AND s.dept_name IN ('개발부','영업부')
ORDER BY  월급등급;
```

sal_grade가 A  인원이 2명이상인 부서명 , 인원수 , 등급   
     ( NON-EQUI JOIN /  EQUI JOIN 같이 사용)
```sql
SELECT
s.dept_name 부서명,COUNT(*) 인원수 ,sg.grade 월급등급 
FROM c_emp c , sal_grade sg , s_dept s
WHERE c.dept_id = s.id AND c.salary BETWEEN sg.losal AND sg.hisal AND sg.grade = 'A'
GROUP BY s.dept_name , sg.grade 
HAVING COUNT(*) >= 2
ORDER BY  부서명;
```

부서 배치 전  신입 사원 2명 RECORD 입력
FROEGIN KEY 제약조건 : 다른 TABLE PK or NULL 입력가능
```sql
INSERT INTO c_emp VALUES(201,'신입1',1500,'3429-0100',null);
INSERT INTO c_emp VALUES(202,'신입2',1500,'3429-0200',null);
COMMIT;
SELECT * FROM c_emp ; 
```

null의 사칙연산은 null이며, null의 비교연산자는 false다.
```sql
SELECT
c.name 이름 , s.dept_name 부서명
FROM c_emp c, s_dept s
WHERE c.dept_id = s.id ;
```

-----------------------------------------------------------------------------
## EQUI JOIN / NON-EQUE JOIN : 조건 만족 조회  
OUTER JOIN : 조건을 불 만족 조회  
SELF JOIN : 1EA TABLE (자기 자신과 JOIN)  

사번, 이름, 관리자사번 조회
```sql
SELECT
empno 사번, ename 이름 , mgr 관리자사번
FROM emp
ORDER BY empno;
```

###OUTER JOIN :: null 을 포함한 조회
```sql
SELECT
c.name 이름 , s.dept_name 부서명
FROM c_emp c, s_dept s
WHERE c.dept_id = s.id (+);
```

###SELF JOIN : 1EA TABLE (자기 자신과 JOIN)    
emp TABLE 이용 : 사번 , 이름 ,관리자사번, 관리자 이름 
```sql
SELECT
e1.empno 사번, e1.ename 이름 , e2.empno 관리자사번 , e2.ename  관리자이름
FROM emp e1, emp e2
WHERE e1.mgr = e2.empno;
```

--------------------

## SubQuery :: Single-low subquery
이순신이랑 사번이같은 사람 추출
```sql
SELECT
id "직원 사번", name 이름
FROM c_emp
WHERE dept_id = (	SELECT
		dept_id
		FROM c_emp
		WHERE name = '이순신' );
```

전체 평균 급여보다 낮은 급여를 받은 직원의 사번, 이름, 급여 조회
```sql
SELECT
id 사번, name 이름 ,  salary 급여
FROM c_emp
WHERE salary < (	SELECT
		AVG(salary)
		FROM c_emp );
```

----------------------

## Multi-Row Subquery

Single-Row subquery로 2개의 값을 리턴 받으려 할때 애러 발생
```sql
SELECT
name 이름 ,  dept_id 부서아이디
FROM c_emp
WHERE dept_id = (	SELECT
		id
		FROM s_dept
		WHERE dept_name IN ('총무부', '영업부') );
```

위와 비교
```sql
SELECT
name 이름 ,  dept_id 부서아이디
FROM c_emp
WHERE dept_id IN (	SELECT
		id
		FROM s_dept
		WHERE dept_name IN ('총무부', '영업부') );
```

join으로도 할수 있다.
```sql
SELECT
name ,  dept_id
FROM c_emp c , s_dept s 
WHERE dept_id = s.id AND s.dept_name IN('총무부','영업부');
```
-----------------------------------------------------------
Multi-Column Subquery
하나의 컬럼을 비교하는것이 아닌 여러개의 컬럼을 비교해야함
> 그래서 쓰래기값이 나옴
```sql
SELECT
name, salary, dept_id
FROM c_emp
WHERE salary IN(	SELECT
		MIN(salary)
		FROM c_emp
		GROUP BY dept_id );
```
NAME                               SALARY    DEPT_ID
------------------------------ ---------- ----------
김사장                               1000          1
홍길동                               2000          1
류시원                               1100          2
이문세                               1200          3
추현재                               1500          4
전두환                               1000          5
김일성                               2000          6

컬럼을 여러개를 주어 비교 한다. 부서번호, 최소값을 같이비교.
```sql
SELECT
name, salary, dept_id
FROM c_emp
WHERE (salary,dept_id) IN(	SELECT
			MIN(salary),dept_id
			FROM c_emp
			GROUP BY dept_id );
```
---------------------------------------------------------------
## 인라인뷰 (가상의 테이블 )을 이용한 조회
```sql
SELECT
c.name, c.salary,c.dept_id
FROM c_emp c, (	SELECT
		MIN(salary) min ,dept_id 부서번호
		FROM c_emp
		GROUP BY dept_id) vt
WHERE c.dept_id = vt.부서번호
	AND c.salary = vt.min;
```
---

이순신과 같은 부서에 근무하는 직원  이름 ,부서명 조회
```sql
select
name 이름 , dept_id 부서명
from c_emp
where dept_id IN (	select
		dept_id
		from c_emp
		where name = '이순신');
```

전체평균금액 보다 낮은 급여를 받는직원  이름 , 부서명 ,급여 , 급여등급 조회
```sql
SELECT
c.name 이름, s.dept_name 부서명, c.salary 급여, sal.grade 등급
FROM c_emp c ,s_dept s, sal_grade sal
WHERE c.dept_id= s.id 
	AND salary BETWEEN sal.losal AND sal.hisal
	AND c.salary < (	SELECT 
			AVG(salary) 
			FROM c_emp);
```

홍길동과 월급등급이 같은 직원   이름, 부서명 , 월급 ,월급등급  조회
```sql
SELECT
c.name 이름, s.dept_name 부서명, c.salary 급여, sal.grade 등급
FROM c_emp c ,s_dept s, sal_grade sal
WHERE c.dept_id= s.id 
	AND salary BETWEEN sal.losal AND sal.hisal
	AND sal.grade IN (	SELECT
			grade
			FROM c_emp c , sal_grade s
			WHERE name ='홍길동' and salary BETWEEN losal AND hisal); 
```
----

## FUNCTION :: RANK() OVER   
- RANK() OVER ([PARTITION BY 컬럼명] ORDER BY 컬럼명 )    
- PARTITION BY : 순위를 지정하기 위한 컬럼의 그룹 설정  
- ORDER BY : 어떤 컬럼에 대한 랭킹을 지정 할지 설정  

**RANK() OVER 함수는 쿼리가 생기고 나서 순서를 지정 함으로 조건에 쓸 수 없다. 그래서 만들어진것에 찾아 조건을 먹여주면 된다.** 
```sql
SELECT
* 
FROM (	SELECT 
	RANK() OVER (ORDER BY salary DESC) "RANKING" ,last_name, first_name, salary 
	FROM employees e)E
WHERE E.RANKING BETWEEN 6 AND  10;
```






