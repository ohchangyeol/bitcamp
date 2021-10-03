09_27 수업정리
====

# EL / JSTL

## 배경
JSP에는 화면만 담당하는 Java Server Page.  
그러기에는 많은 java형식의 코드가 있고 그것을 불편하게 `<% %>`등으로 사용했다. 불편한 점을 한방에 해결할 수 있는 **EL(Expression Language)**과 **JSTL(Jsp Standard Tag Library)**를 사용하여 코드를 간결하고 편하게 사용할 수 있도록 제공 함.

## 차이점
**EL(Expression Language)**은 `<%= abc %>`를 `${abc}`로 간단하게 사용할 수 있게 하였고,  
**JSTL(Jsp Standard Tag Library)**의 Core를 이용해 `<%= if%>`문을 `<c:if>`,  
`<%=for%>`문을 `<c:forEach>`로 대체하여 사용한다.

# EL (Expression Language)

## EL (Expression Language) 특징
  1. Object Scope에 접근이 용이하다.
  2. bean Field 접근이 용이하다.
  3. collection (vector, ArrayList)등 접근이 용이하다.
  4. 자체 연산자 제공.
  5. 내장 객체 제공.

## 내장 객체

###  Object Scope에 접근 객체 
> Object Scope의 우선 순위? (생략시)  
> page < Request < session < application
1) pageScope   
   → 페이지Scope에 접근 ( **잘 사용하지 않음 / 약간 local 변수같은 느낌..? 해당 jsp에서만 사용**)
2) **request Scope**  
   → 리퀘스트Scope에 접근
3) sessionScope    
   → 세션Scope에 접근
4) applicationScope   
   → 어플리케이션Scope에 접근

### request에서 정보를 접근할 수 있는 객체 
1) **param**   
   → 파라미터값 얻어올때 ( 1개의 Key에 1개의 Value )
   ```jsp
   request.getParameter("name");
   param.name
   ```
2) **paramValues**   
   → 파라미터값 배열로 얻어올때( 1개의 Key에 여러개의 Value) 
    ```jsp
    request.getAttribute("name");
    name
    ```

3) header   
   → 헤더값 얻어올때 ( 1개의 Key에 1개의 Value ) 
4) headerValues   
   → 헤더값 배열로 얻어올때 ( 1개의 Key에 여러개의 Value ) 
5)  **cookie**   
    → ${cookie. key값. value값}으로 쿠키값 조회
6) initParam   
    → 초기 파라미터 조회
7) **pageContext** [API 참고](https://tomcat.apache.org/tomcat-7.0-doc/jspapi/javax/servlet/jsp/PageContext.html)   
    → 페이지컨텍스트 객체를 참조할때  
    ※Context가 붙으면 해당 모든 정보를 가지고 있다 ?※

## OGNL (Object Graph Navigation Language)
get 생략 ?
```jap
<c:set var ="test" value ="${new A()}" scope ="request"/>

A test01 = request.getAttribute("test");
test01.getName();

${test.name}

```
<br/>

# JSTL(Jsp Standard Tag Library)

##  core tag에 대해
- <c:set>
  ```jsp
  <c:set var="num" value="100" scope="page">
  ```
- <c:out>
  ```jsp
  system.out.println(" 안녕하세요 ");
  <c:out value=" 안녕하세요 ">
  //같음
  ```
- <c:remove>
  ```jsp
  <c:remove var = "num" scope="page"/>
  ```
- <c:if>
  ```jsp
  <c:if test="조건식" var ="조건을 검사하고 return되는 bool값을 저장할 변수"scope="bool 변수가 사용될 범위" >
  // scope 생략시 page 기본 값 
  </c:if>
  ```
- <c:choose>
  ```
  <c:choose>
      <c:when test="${empty list }">
          등록된 글이 없습니다.    
      </c:when>
      <c:when test="${abc}">
          안녕하세요    
      </c:when>
      <c:otherwise>
          <c:set var="doneLoop" value="false" />
      </c:otherwise>
  </c:choose>
  ```
- <c:forEach>  
    아래 설명
    
## zero configuration
 default를 생략한 경우
 ```jsp
 <c:forEach var="i" items="<%=vector%>" begin ="0" step ="1" end ="10">
	::Vector저장 정보 추출 : ${i} <br/>
</c:forEach>

<c:forEach var="i" items="<%=vector%>">
	::Vector저장 정보 추출 :  ${i} <br/>
</c:forEach>

// 같은 결과 값
 ```

