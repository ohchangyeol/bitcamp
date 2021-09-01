# 08_31 수업 정리

## 용어 정리

    sqlplus - 오라클에 접속하는 툴 
    r.dbms 관계? 테이블과 테이블끼리 관계를 맺는것을 말한다.
    r.dbms의 표준 명령어가 sql 
    hr.dbms 하이라키 구조 dbms 
    o.dbms 오브젝트를 넣는 dbms
    Query
    클래스 다이아그램 - 클래스 모델링
    테이블 - 메트릭스 구조
    테이블다이아그램 - ERD - 테이블 모델링 
    레코드 로우 
    Column -  데이터의 성질을 나타냄
    셀.필드 - 로우와 컬럼을 만나는부분

    테이블 부터 셀까지 그림 필요.


# DBMS의 정의
DBMS는 **DataBase Management System**의 약자로 **데이터 베이스를 관리하는 시스템**이다.  
DBMS 플랫폼에 종속적인 개발을 하면 불편한 일이 많아진다.
 ## RDBMS
 - RDB를 생성하고 수정하고 관리할 수 있는 소프트 웨어.
 - RDBMS는 Relational DataBase Management System의 약자로 **관계형 모델을 기반으로 하는 DBMS유형**

        Oracle , MySQL , Microsoft SQL Server , PostgerSQL , 등등 있다.
## HDBMS
- 계층형 데이터 베이스 관리 시스템.
- 하이라키 구조로 되어 있어 데이터의 엑세스 속도가 빠르고 데이터의 사용량을 쉽게 예측 가능.
- 상하 종속 관계로 구성되어있어 초기 세팅 후 변화하는 프로세스를 수용하기 쉽지않다.
## ODBMS
- 객체 지향 데이터베이스 관리시스템.
- 계층(Class)에 따라 데이터 구조를 표현하고 데이터와 그 조작 절차를 함께 다룬다.

***
# SQL - 1

## SQL 이란?
오라클, mySQL, DB2 전부다 기본적인 SQL은 제공하지만 구체적인 확장 기능이 다르다. 그리고 확장된 기능은 각 확장자에서만 사용할 수 있다.  
**표준화 된 SQL만 사용할 줄 안다면 다 사용 가능**하다.  
sql 은 표준화 되있지만 오라클에만 접속하는 툴은 `sqlplus` 가 있다.  
데이터는 검색에 제일 많이 쓰인다.

## 알아두면 좋은 것들
- SQL은 대소문자를 구분하지않음
- 예약어(keyword) - 대문자
- 식별자(identifier) - 소문자

## Table 
<img src="http://wiki.hash.kr/images/a/a1/%ED%85%8C%EC%9D%B4%EB%B8%94_%EC%84%A4%EB%AA%85.png" width="750">



## SQL문의 종류
- **DDL** (Data Definition Language) **테이블과 관련된 명령어**
  
  |SQL문|내용|
  |:-:|:-:|
  |CREATE|DB 객체 생성|
  |DROP|DB 객체 삭제|
  |ALTER| 기존 DB 수정|

- **DML** (Data Manipulation Language) **데이터 조작 명령어**

    |SQL문|내용|
  |:-:|:-:|
  |INSERT|DB 객체에 대이터 입력|
  |DELETE|DB 객체의 데이터 삭제|
  |UPDATE|기존 DB 객체 안의 데이터 수정|
  |**SELECT**| DB 객체로부터 검색|

    > select 는 **Query**로 구분할수도 있다

- **DCL** (Data Control Language)  **데이터 권한과 관련된 명령어** 
  
    |SQL문|내용|
    |:-:|:-:|
    |GRANT|특정 DB 객체에 권한을 부여|
    |REVOKE|부여된 DB 객체에 권한 취소|

- **TCL** (Transaction Control Language) **DCL에서 COMMIT, ROLLBACK만 분리**
  
    |SQL문|내용|
    |:-:|:-:|
    |COMMIT|트랜잭션이 수행한 변경 내용을 저장|
    |ROLLBACK|트랜잭션이 수행한 변경 내용을 취소하고 이전 상태로 되돌리는 작업|

## 데이터 타입

 - 문자 
    - **CHAR(n)**  
    문자의 길이가 n 으로 고정되어 있다.
    - **VERCHAR2(n)**   
    문자의 길이가 n 이라고 되있어도 실제 들어있는 길이를 나타낸다.

 - 숫자 
    - **NUMBER**(5)  
    99999 - 정수표현
    - **NUMBER**(5,2)   
    99999.99 - 실수표현

 - 날짜 
    - **SYSDATE**   
    현재 날짜와 시간이 나온다
    - **DATE**  
    고정된 날짜를 지정할 수 있다

> 이것 뿐만이 아니라 다양하게 많다.

***
## DDL :: TABLE 생성
>모델링 할때 시간을 많이 투자하지만 그 후 잘 사용하지않는다.

구조??
```sql
  /*c/n     data Type    keyword    조건 이름            key                   */
    id	    NUMBER(5)	CONSTRAINT	c_emp_id_pk		    PRIMARY KEY,
	name	CHAR(15)	CONSTRAINT	c_emp_name_nn		NOT NULL,
	salary	NUMBER(7,2),
	phone	CHAR(15)	CONSTRAINT	c_emp_phone_ch		CHECK(phone LIKE '3429-%'),
	dept_id	NUMBER(7)	CONSTRAINT	c_emp_s_dept_id_fk	REFERENCES   s_dept( id )
```
```SQL
CREATE TABLE emp_test (
	id			NUMBER(3) ,
	name		VARCHAR2(15) ,
	salary		NUMBER(7,2) ,
	title		VARCHAR2(15)	DEFAULT	'사원' ,
	in_date		DATE			DEFAULT	 SYSDATE,
	dept_name	VARCHAR2(15)
);
```
 - DEFAULT - 관리자가 value를 넣지 않아도 지정.
```SQL
CREATE TABLE emp_test (
)
```
- TABLE은 1개 이상의 COLUMN을 갖는다.  
***
## DDL :: TABLE 삭제
```SQL
DROP TABLE test_table;
```
***
## 테이블 구조 확인 및 TABLE RECORE 확인
```SQL
DESC emp_test;
DESCRIBE emp_test;
```
- **DESC** 는 DESCRIBE의 약자
- 둘다 사용 가능
  
```SQL
SELECT * FROM emp_test;
[WHERE 조건]
```
- RECORD를 생성하지 않으면 선택한 레코드가 없다고 나온다.
  
***
## DUAL을 이용한 가상 TABLE
```SQL
SELECT SYSDATE FROM DUAL; /* SYSDATE 현재 날짜 */

SELECT 9*9 FROM DUAL; /* 연산 */

SELECT USER FROM DUAL; /* USER 사용자 계정*/
```
--- 
## DML :: TABLE COLUMN VALUE 입력

구조??
```sql
INSERT 
INTO table_name ( column_name [, column_name ... ] )
	    VALUES ( record [,record ...] );
```
<br/>

모든 COLUMN VALUE 입력 
```SQL
INSERT 
INTO emp_test (id, name, salary, title, in_date, dept_name) /*식별자 */
	    VALUES (1, '김사장', 100,'사장','04-07-19','개발부'); /*식별자에 대한 값.*/
```
모든 COLUMN VALUE 입력 경우 COLUMN LIST 생략 가능
```SQL 
INSERT 
INTO emp_test
	VALUES (2, '홍길동', 1000,'부사장','2004/07/19','영업부');
```
일부 COLUMN VALUE 입력
```SQL 
INSERT 
INTO emp_test (id, name, salary)
	VALUES (3, '홍길동', 10000);
```
키워드를 사용해서 벨류 입력
```SQL 
INTO emp_test
	VALUES (2, USER, 1000,'부사장',SYSDATE,'영업부');
```
NULL 입력 :: 묵시적 입력
```SQL 
INSERT 
INTO emp_test (id, name)
	VALUES (5, '장나라');

SELECT * FROM emp_test;
```
NULL 또는 사용
```SQL 
INSERT 
INTO emp_test
	VALUES (6, '신나라',NULL, null, '','');

SELECT * FROM emp_test;
```
***
## DML :: TABLE RECORD 수정

구조??
```sql
UPDATE table_name
SET column_name = record 
[WHERE column_name = record ] /* 어떤것을 바꿀지 */
```
<br/>

id를 7로 수정
```SQL 
UPDATE emp_test
SET id = 7
WHERE name = 'SCOTT'; 
```
영업부를 관리부로 전부 변경
```SQL 
UPDATE emp_test
SET DEPT_NAME = '관리부'
WHERE dept_name = '영업부'; 
```
여러개 변경
```sql
UPDATE emp_test
SET TITLE = '사장', SALARY = 2000, DEPT_NAME = '영업팀'
WHERE name = '홍길순'; 
```
비교 연산자를 통해 1500 이상인 사람 변경
```sql
UPDATE emp_test
SET DEPT_NAME = '대기발령'
WHERE SALARY >= 1500 ; 
```
전부다 바꾸기 WHERE이 없다면 전체 적용.
```sql
UPDATE emp_test
SET title = '평사원';
/* WHERE 없음*/ 
```
NULL의 사직연산은 NULL;
```sql
UPDATE emp_test
SET SALARY = SALARY+500;
```
NULL 은 연산에서 제외 ==> NULL 비교는 false
```SQL
UPDATE emp_test
SET DEPT_NAME = '대기발령'
WHERE DEPT_NAME IS NULL; /*IS와 NULL는 키워드*/
```
NOT 키워드를 이용한 NULL이 아닌것 변경
```SQL
UPDATE emp_test
SET DEPT_NAME = '대기발령'
WHERE DEPT_NAME IS NOT NULL; /*NOT도 키워드*/
```
---

## DML :: TABLE COLUMN VALUE 삭제
>거의 사용하지 않음

구조??
```sql
DELETE FROM table_name
[WHERE column_name = record ] /* 어떤것을 지울지 */
```

<br/>

장군 RECORD 삭제
```SQL
DELETE FROM emp_test
WHERE title ='장군';
```
AND 연산자 키워드를 이용한 삭제
```SQL
DELETE FROM emp_test
WHERE id >= 5 AND id <= 6;
```
OR 연산자 키워드를 이용한 삭제
```SQL
DELETE FROM emp_test
WHERE id = 5 OR id = 6;
```
WHERE 이 없으면 전부다 삭제
```SQL
DELETE FROM emp_test;
```
---
## DML :: TABLE RECORD 찾기
> 현업에서 * (별표)를 쓰지않음


구조??
```sql
SELECT
column_name [, column_name ...]
FROM table_name [, table_name ...]                      /*여기까진 필수*/
[WHERE 조건]                                            /* 조건 */
[GROUP BY column_name [, column_name] ]                /* 1:N 일때 그룹화 */
[HAVING 조건]                                          /* 그룹화 후 추가 조건 */
[ORDER BY column_name [,column_name ...] ASC [DESC] ]  /* 정렬 */
```
<br/>

모든 내용을 찾기
```sql
SELECT * FROM emp_test;
```
산술식 (EXPRESSION) 이용
```SQL
SELECT
name, salary, salary*12
FROM emp_test;
```
AS - ALIAS
```SQL
SELECT 
name AS 이름, salary AS 월급, salary*12 AS 연봉
FROM emp_test;
```
AS - ALIAS 생략 가능 ==> 띄어쓰기로 구분
```SQL
SELECT 
name 이름, salary 월급, salary*12 연봉
FROM emp_test;
```
스페이스바나 특수 문자 쓰고싶을땐 `" "`
```SQL
SELECT 
name 이름, salary 월급, salary*12 "연봉 (성과급 제외)"
FROM emp_test;
```
***
### FUNCTION :: NULL 처리
null 인 경우, null 이 아닌 경우 처리 ==> NVL NOTATION 
```SQL
SELECT 
name, NVL(salary,0)
FROM emp_test;
```

데이터타입 다름으로 에러발생
```SQL
SELECT 
name, NVL(salary,'무급')
FROM emp_test;
```

NVL2( COLUMN_NAME , [NULL이 아닌 경우] , [NULL 인 경우] )
```SQL
SELECT 
name, NVL2(salary,salary , 0) , NVL(salary,0)
FROM emp_test;
```
위와 아래를 비교
```SQL
SELECT 
name, NVL2(title,title ,'<직급없음>') , 
    NVL(title ,'<직급없음>'), 
    NVL2(title,'직급있음' ,'<직급없음>')
FROM emp_test;
```
AS 와 NVL 혼용해서 사용하기
``` SQL
SELECT 
name 이름,
NVL(TITLE, '인사발령전') 직책, 
NVL(salary, 0) 월급, 
NVL(salary*12, 0) 연봉,
NVL(salary*0.15, 0) "특별상여금"
FROM emp_test;
```
###  FUNCTION :: DECODE if-else 
DECODE ( COLUMN_NAME , 조건 ,[조건인 경우] , [조건이 아닌 경우] ) ==> if ~ else
```SQL
SELECT 
name, DECODE (title, NULL,'<직급없음>', '직급있음')
FROM emp_test;
```
if ~ if-else ~ else
```SQL
SELECT 
name, DECODE (title, 
NULL,'<직급없음>',
'사장','회사의아버지',
'부사장','회사의어머니',
'직급있음'),title
FROM emp_test;
```
### ROUND  :: TRUNC
ROUND( VALUE, 반올림자리수 ) :: TRUNC ( VALUE,  버림자리수 )
```SQL
SELECT	
name 이름, salary 월급,
ROUND(salary/12, 0.0) 일당,
TRUNC((salary/12)/24, 0.0) 시급
FROM emp_test;
```
---
### KEWORD :: CONCATENATION (COLUMN) 합성
> 잘 안씀 ... ||로 합성
```SQL
SELECT 
name||' '||title
FROM emp_test;
```
### KEWORD :: DISTINCT 중복 제거
```SQL
SELECT 
DISTINCT dept_name 부서명
FROM emp_test;
```
### KEWORD :: ORDER BY 정렬
> ASC (오름차순) , DESE (내림차순)
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
ORDER BY salary ASC;
```
생략하면 기본값 `ASC`
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
ORDER BY salary;
```

ASC(오름차순) 일때 NULL은 마지막 :: DESC(내림차순) 일때 NULL은 처음  
키워드로 NULL을 올릴지 내릴지 정할 수 있음. 
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
ORDER BY salary NULLS FIRST;
```
```SQL
SELECT 
name 이름, salary 월급
FROM emp_test
ORDER BY salary NULLS LAST;
```