# 09_01 수업 정리

## 용어정리
    내장함수 
    그룹함수

## 이전 내용에 추가
    create - 모델링 할때 시간을 많이 투자하지만 그 후 잘 사용하지않는다.
    delete - 거의 사용하지 않음
    dbms 플랫폼에 종속적인 개발을 하면 불편한 일이 많아진다.

# SQL :: part 2

## 조건에 다양하게 쓰는 keyword 
- AND
- OR 
- NOT

SQL연산자
- BETWEEN   
	salary BETWEEN A AND B ==> salary 
	
- IN   
	salary IN ( value , [ value ] )
- LIKE  
	name LIKE '김 %' ==> 김에 관련된 모든 것을 검색  
	name LIKE '김 _'   ==> 김을 포함한 외자  검색

## 테이블 제약 조건 
무결성을 갖기위해 제약조건을 건다
|제약 조건| 설명| 
|:-----:|:----|
|PRIMARY KEY(PK)| 그 사람만이 가지고 있는 고유의 값 (NOT NULL , UNIQUE)|
|UNIQUE KEY (UK)|중복되는 값 X ( NULL을 허용 )|
|FOREIGN KEY (FK)|해당 칼럼 값은 참조되는 테이블의 칼럼 값 중 하나와 일치하거나 Null을 가짐  
||- 자식 테이블 : 다른 테이블의 값을 참조하는 테이블
||- 외래키(foreign key): 부모테이블의 값을 참조하는 자식테이블의 칼럼
||- 부모 테이블 : 다른 테이블에 의해 참조되는 테이블
||- 참조키(reference : 자식 테이블에서 참조하는 부모 테이블의 칼럼
|NOT NULL (NN)|Null값 포함할수 없음|
|CHECK (CK)|해당 칼럼에 저장 가능한 데이터 값의 범위나 조건 지정|


## 카테시안 곱(Cartesian Product)
- From절에 2개 이상의 Table이 있을때 두 Table 사이에 유효 join 조건을 적지 않았을때 해당 테이블에 대한 모든 데이터를 전부 결합하여 Table에 존재하는 행 갯수를 곱한 만큼의 결과값이 반환되는 것.

----------

## WHERE 조건 :: 비교 연산자 

월급 5000 이상 이름 월급 입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE salary >= 5000
ORDER BY salary;
```
04-01-01 이후 입사자 이름,월급,입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE in_date >= '2004-01-01'
ORDER BY in_date;
```
이름 이순신666 이상 이름,월급, 입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE name >= '이순신666'
ORDER BY name;
```

-----------------------------------------------------------------

## WHERE 조건절 :: 논리연산자 (NOT,AND,OR)

04-01-01 이후 입사자 이며 월급이 5000 이상 이름,월급, 입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE in_date > '2004-01-01' AND salary >= 5000;
```
07-01-01 이후 입사자이며 월급이 5000 이상 또는 관리부 직원
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE in_date > '2007-01-01' AND salary >= 5000 OR dept_name='관리부';
```
()우선순위의 이해
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE in_date > '2007-01-01' AND (salary >= 5000 OR dept_name='관리부');
```
--------------------------------------------------------------------

## WHERE 조건절 :: SQL 연산자 BETWEEN A AND B (주의 A < B 일것)
```SQL
SELECT 
[칼럼명] 
FROM [테이블명] 
WHERE [칼럼명] between [하한] and [상한]; 
```
<br/>

월급이 1000 ~ 2500 사이 ( 포함 ) 이름,월급, 입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE salary BETWEEN 1000 AND 2500
ORDER BY salary;
```

위와 비교 (주의 A < B) 
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE salary BETWEEN 2500 AND 1000
ORDER BY salary;
```
월급이 1000 ~ 2500 사이를 제외한 이름, 월급, 입사일 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE salary NOT BETWEEN 1000 AND 2500
ORDER BY salary;
```
김유신222 ~ 한국990 사이 이름 조회
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE name BETWEEN '김유신222' AND '한국990'
ORDER BY name;
```
위와 비교 (주의 A < B)
```SQL
SELECT 
name 이름, salary 월급 , in_date 입사일
FROM emp_test
WHERE name BETWEEN '한국990' AND '김유신222'
ORDER BY name;
```

-------------------------------------------------------------------

## WHERE 조건절 :: SQL 연산자 IN (일치하는 것, 일치하는 것)

관리부와 영업부 이름, 부서 조회    
==> dept_name = '관리부' OR dept_name = '영업부'
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE dept_name IN ('관리부', '영업부')
ORDER BY dept_name;
```
관리부와 영업부를 제외한 나머지 이름, 부서 조회
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE dept_name NOT IN ('관리부', '영업부')
ORDER BY dept_name;
```
---------------------------------------------------------------------

## WHERE 조건절 :: SQL 연산자 LIKE

김씨 성을 갖는이름 , 부서 조회
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김%';
```
김씨 성을 갖고 이름이 1자인 이름, 부서 조회
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김_';
```
김씨성을 갖고 이름이 2자인 이름, 부서 조회
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '김__';
```
가운데가 길인 이름이 3자인 이름, 부서 조회
```SQL
SELECT 
name 이름, dept_name 부서
FROM emp_test
WHERE name LIKE '_길_';
```
입사일 01년 이후 ...
```SQL
SELECT 
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '%01';
```
입사일 04년 이후 ...
```SQL
SELECT 
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '%04';
```
입사일 0으로 시작 전부다
```SQL
SELECT 
name 이름, in_date 입사일
FROM emp_test
WHERE in_date LIKE '%0';
```
-----------------------------------------------------------------------

## WHERE 조건절 :: SQL 연산자 LIKE 및 KEYWORD
키워드가 들어간 사람 생성
```SQL
INSERT INTO emp_test (name , title) VALUES ('박_%','특수%');
INSERT INTO emp_test (name , title) VALUES ('김_%','특수%');
SELECT * FROM emp_test;
COMMIT;
```
`__%` 검색의 결과는 전부다 검색
```SQL
SELECT 
*
FROM emp_test
WHERE name LIKE '__%';
```
키워드 **ESCAPE** 옵션 사용
```SQL
SELECT 
*
FROM emp_test
WHERE name LIKE '_\_\%' ESCAPE'\';
```
```SQL
SELECT 
*
FROM emp_test
WHERE name LIKE '_?_?%' ESCAPE'?';
```
-------------------------------------------

## WHERE 조건절 :: SQL 연산자 ALL , ANY 및 IN 

- ALL :: 모두가 만족
- ANY :: 한쪽만 만족해야 한다.

최대값의 의미
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
WHERE salary > ALL(2500,5000);
```
최소값의 의미
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
WHERE salary > ANY(2500,5000); 
```
포함
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
WHERE salary NOT IN(3333,4444);
```
----------------------------------------------------------------------

## 그룹함수 :: COUNT(컬럼명) , 키워드 ROWNUM , NULL에 대해  

COUNT(*) 의미 => 레코드수를 리턴해주는 것
```SQL
SELECT 
COUNT(*)
FROM emp_test;
```
키워드 ROWNUM 
- 조회된 순서대로 순번을 매긴다.
```SQL
SELECT 
ROWNUM , id,name
FROM emp_test;
```
**다중행 함수는 NULL은 연산대상에서 제외**
```SQL
SELECT 
COUNT(*) 레코드,
COUNT(salary) "월급 수령자",
COUNT(NVL(salary,0)) "월급 수령자 (NULL포함)",
COUNT(DISTINCT salary) "월급종류",
COUNT(DISTINCT NVL(salary,0)) "월급종류 (NULL 포함)"
FROM emp_test;
```
       레코드   월급 수령자	 월급 수령자 (NULL포함)	  월급종류	 월급종류 (NULL 포함)
    ---------- ----------- ---------------------- ---------- --------------------
        18          12              18                11             12


영업부 인원수 count 조회
```SQL
SELECT 
COUNT(*) 영업부직원1,
COUNT(dept_name) "영업부직원2",
COUNT(salary) 영업부직원월급수령자
FROM emp_test
WHERE dept_name = '영업부';
```
아래 비교
```SQL
SELECT * FROM emp_test WHERE dept_name = '영업부';
```
관리부 월급함 최대/최소/평균 조회
```SQL
SELECT 
SUM(salary) 관리부월급함,
MAX(salary) 관리부최대월급,
MIN(salary) 관리부최소월급,
AVG(salary) 관리부평균월급,
AVG(NVL(salary,0)) 관리부평균월급,
FROM emp_test
WHERE dept_name='관리부';
```

--------------------------------------------------------------
## where 조건절 :: GROUP BY

이름은 여러개 / MAX (salary) 는 한개
```SQL
SELECT 
name, MAX(salary)
FROM emp_test
WHERE dept_name = '관리부';
```

똑같은것을 하나로 만들어주는 것이 **GROUP BY**
```SQL
SELECT 
dept_name, MAX(salary)
FROM emp_test
WHERE dept_name = '관리부'
GROUP BY dept_name;
```
WHERE 가 없으면 각 부서에 최대가 나온다. 
```SQL
SELECT 
dept_name, MAX(salary)
FROM emp_test
GROUP BY dept_name;
```
부서명 NULL 제외
```SQL
SELECT 
dept_name, MAX(salary)
FROM emp_test
WHERE dept_name IS NOT NULL
GROUP BY dept_name;
```
부서명, 각 부서 평균 급여 출력
```SQL
SELECT 
dept_name, AVG(salary)
FROM emp_test
WHERE dept_name IS NOT NULL
GROUP BY dept_name
ORDER BY dept_name;
```
--------------
## where 조건절 :: GROUP BY 과 HAVING

부서명 / 부서salary 평균 / 합 /인원수 조회 (부서명 null / 대기발령  제외)

```SQL
SELECT 
dept_name 부서명, 
AVG(salary)" 부서salary 평균",
SUM(salary) "부서salary 합", 
COUNT(dept_name) "인원수 조회"
FROM emp_test
WHERE dept_name NOT IN('대기발령') AND dept_name IS NOT NULL
GROUP BY dept_name;
```


부서명 / 부서salary 평균 / 합 /인원수 조회 (부서명 null / 대기발령  제외)  
    ==> 인원수가 5이상만 출력

```SQL
SELECT 
dept_name 부서명, 
AVG(salary)" 부서salary 평균",
SUM(salary) "부서salary 합", 
COUNT(dept_name) "인원수 조회"
FROM emp_test
WHERE dept_name NOT IN('대기발령') AND dept_name IS NOT NULL
GROUP BY dept_name
HAVING COUNT(*) >=5;
```

부서명 / 부서salary 평균 / 합 /인원수 조회 (부서명 null / 대기발령  제외)  
     ==> 인원수가 5이상만 출력  
     ==>  평균급여가 5000이상

```SQL
SELECT 
dept_name 부서명, 
AVG(salary)" 부서salary 평균",
SUM(salary) "부서salary 합", 
COUNT(dept_name) "인원수 조회"
FROM emp_test
WHERE dept_name NOT IN('대기발령') AND dept_name IS NOT NULL
GROUP BY dept_name
HAVING COUNT(*) >=5 AND AVG(salary) >= 5000;
```


-----------------------------------------------------------------------------

## Join :: 

테이블을 연결 하여 데이터 검색
```SQL
SELECT 
c_emp.name , c_emp.dept_id, s_dept.id , s_dept.dept_name
FROM c_emp ,  s_dept;
```
중복 제거 조건 추가
```SQL
SELECT 
c_emp.name , c_emp.dept_id, s_dept.id , s_dept.dept_name
FROM c_emp ,  s_dept
WHERE c_emp.dept_id = s_dept.id;
```

FROM 에 식별성 추가
```SQL
SELECT 
c.name , c.dept_id, s.id, s.dept_name
FROM c_emp c,  s_dept s
WHERE c.dept_id = s.id AND s.dept_name IN ('총무부');
```