09_09 수업정리
====

## 용어
    meta data
    Dao - data base에 왔다 갔다 하는 bean
    DBCP

# Servlet - part 4

## servlet의 모듈화에 대해
1. **Presentation+Business logic**  
servlet 파트에 Presentation과 Business logic이 합쳐져 있는 구성  
   
   > 협업에 지장이 생기고, 유지보수가 힘들며, 재사용성이 떨어진다.
2. **view(Presentation) / Business logic**  
   Presentation(동적인 부분)을 view 파트, Business logic(데이터 관련) 파트로 구성
   > 비지니스 로직에 사용자의 정보와 DB의 정보가 같이 있음으로 성질이 다른것이 묶여있다.
3. **view(Presentation) / Business logic ( VO / DAO )**  
   Business logic 부분을 Value Object(VO)와 Data Access Object(DAO) 파트로 구성
   >유저정보와 분리는 시켰지만, 데이터 관련쪽은 RDBMS가 바뀌게 되면 수정사항이 많아 효율성, 재사용성이 떨어진다.
4. **view(Presentation) / Business logic ( VO / DAO ) + Web.xml**  
   DAO부분의 RDBMS에 종속적인 것이 아닌 다형성에 맞게 구성
   > client의 요청에 따라 Connection(DB에 접속)요청이 많으면 많을수록 딜레이가 심해지기 시작한다.
5. **view(Presentation) / Business logic ( VO / DAO ) + Web.xml + Connection pool**  
   Connection부분을 따로 관리 하는 구성
   > Connection pool에 Connection을 미리 생성 시켜놓고 요청이 들어오면 **제공해줬다가 다시 반환 됨으로 커넥션을 효율적으로 이용**하기 시작했다.
   
### 결론
Presentation layer , B/L layer로 관리를 하고 비지니스로직에는 더 세부적으로 관리한다.

## InterFace servletConfig
xml이 WAS를 통해 parsing이 되면 객체화 한 것을 servletConfig이라 한다. 그말은 즉 xml이 servletConfig인 셈이지 않을까 싶다.  
servletConfig안에 MetaData를 넣어 사용하는 방법이 있다. 하지만 xml은 형식이 안맞거나 오타가 있으면 서버 자체가 실행이 안되는 위험도 갖고있다.  
그러니까 아주 간단하거나 가벼운 데이터만 사용하는것을 권한다는데 ...
**GenericServlet의 오버로딩 되어 있는 init()의 데이터 타입임**

## MetaData
시스템을 돌리는데 필요한 정보를 효울적으로 이용하기 위해 일정한규칙에 따라 콘텐츠에 대하여 부여된 데이터이다.  
servlet뿐만이 아닌 모든 데이터 관련에는 있는것 같다.

# Connection pool
WAS가 실행되면서 DB와 미리 connection을 해놓은 객체들을 pool에 저장해두었다가 클라이언트 요청이 오면 connection을 빌려주고, 처리가 끝나면 다시 connection을 반납받아 pool에 저장하는 방식을 말한다. 
## 사용하는 이유
자바에 DB를 직접 connection을 처리 하는 경우 Driver를 로드하고 connection하고 SQL을 수행하고 종료하는 과정중 중 시간이 소모될 뿐더러 사용자가 많다면 Driver를 로드하고 연결하고 종료하는 것이 너무 비효율적이기 때문이다.

## 여기서 DBCP란?
**DataBase Connection Pool** 의 약자로 DB와 커넥션을 맺고 있는 객체를 관리하는 역할을 합니다.

# Data Source
Connection pool은 개발자가 직접 만들고 관리를 해야한다면 Java 진영에서 Connection pool을 스팩화(구현) 시켜놓은것을 말한다.  


# Cookie & Session

## 상태정보 유지기술 분류

Client
- 웹 브라우저에 저장되는 것(Cookie)  

Server
- 서버에 저장하는 것
  - ServletContext
  - HttpSession
  - HttpServletRequest

> 상태 정보 유지기간에 따라 사용하는 용도가 다르다

## 단위별 사용하는 용도

- web app 단위   
웹 어플리케이션이 서비스 되고 있는 동안만 유지  
   >ServletContext
 

- client 단위  
client의 Browser 별로 구분해서 유지  
   >Cookie, HttpSession
 

- 요청 단위  
클라이언트의 서비스 요청 단위로 유지  
   >HttpServletRequest

## ServletContext
하나의 서블릿이 서블릿 컨테이너와 통신하기 위해서 사용되어지는 메서드들을 가지고 있는 클래스가 바로 **ServletContext**