09_08 수업정리
===

# 용어

    IDE -Integrated Development Environment 통합 개발 환경
    플러그인
    alias - 다른 이름
    모듈화 
    디펜던시
    layer
    프리젠테이션 레이어
    비지니스 로직 레이어
    2레이어 아키텍처
    모델 1 아키택처


# Servlet - part 3


## 복습 - 표준화된 폴더 구조
**class Path는 classes로 defult 되어 있다.**
```bash
[Tomcat home]
    └── webapps
            └── examples 
                ├── ~~.html , ~~.jsp
                └── WEB-INF
                        ├── ~~.xml
                        └── classes
                                └── ~~.java , ~~.class
```

## eclipse의 표준화된 폴더 구조

```bash
[Project Name]
    └── webapps
            └── examples 
                ├── ~~.html , ~~.jsp
                └── WEB-INF
                        ├── ~~.xml
               
```
## html - Form action 과 mapping의 연결
action 과 url-mapping-pattern이 같은지 확인.

절대 경로 와 상대경로의 차이는 확실하고 중요하다.

- 절대경로  
  절대경로 인 경우 http:// 127.0.0.1:port/ - port뒤에 바로 붙는다
- **상대경로**    
  상대경로 인 경우 html이 시작하는 경로가 .(현재 경로)로 지정됨으로 차이가 크다. ( . 과 .. 의 차이가 획실하다.)

% WEB-INF 의 상위 디렉토리가 classes가 됨???? 아 뭐라 설명해야할지... %

## WAS의 기준
WAS를 고르른 기준은 servlet-version과 연관, WAS의 종류랑은 관련이 없다.  
기본중에 기본... 

## method
- getQueryString()  
  URI를 확인.
- setContentType()  
  ()안에 들어가는 값은 text/html이 아닌 다른것이 들어가면 브라우저는 파일을 다운로드 한다.

- getParamiterValues()   
  String[] return - 여러 key값인 경우 array로 받아 사용.
# enumeration`<E>`
되게 자주 쓰일 것같은 느낌이 든다.
- hasMoreElement()  
  boolean return - 안에 값이 있는지 확인
- nextElenent()  
  요소 반환.

