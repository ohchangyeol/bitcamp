# 08_30 수업정리


## 용어 정리 해야할 것들
    URL & = 로 조합된 것
    스트림 - 책 624
    프로토콜 - 전산에서 약속
    어플리케이션 프로토콜 ?? 
    Interface - runnanle
    Marker interface - 구현할게 없는 인터페이스 
    URI
    Null String
    쓰레드 스케줄러
    runnable
    
  




## PrintWriter - api 찾아보기

## Serializable(직렬화)
시스템 내부에서 사용되는 Object 또는 Data를 외부의 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술  
- 언젠가 데이터를 밖으로 보내줄 의향이 있는 애들 한테 인터페이스를 붙힘

### 왜`Vector`에 **Serializable**이 붙을까?
class를 백터에 담아서 한번에 보내냐, 아니면 하나하나 씩 보내는 것 차이 

## valueObject
회원 정보를 가지고있는 오브젝트. valueObject class 안에 필드와 메서드밖에 없다.
> class명 뒤에 VO를 뒤에 붙힘

<!-- 
전산이란 시스템은 c:/a/b/zzz.txt 파일 시스템이라 함 
parent = c:/a/b/  까지
child = zzz.txt  -->

## NullString
```java 
String s1 = new String(); s1.length(); // => 0
String s2 = null; s2.length()  //=> NullPointerException
```

## Multi-Testing
여러개의 어플리케이션을 돌리는 것.

## Thread Scheduler(쓰레드 스케줄러)
cpu를 만나게 도와주는 공간? 다른말로 [runnable](#interface---runnanle)이라고 쓰일수도 있음.  
 **JVM**이 run에 올리고 내리고 하는 역활을 해줌.

## Interface - Runnanle
간단하게 말해서 Thread의 인터페이스화 된 형태이다.  
Java에서는 다중상속이 불가능하여 Thread를 상속 받지 못하는 경우 implements로 Runnable을 받아 구현하여 처리 할 수 있습니다.
## Thread 
> java.leng 패키지  
> **main**도 **Thread**  

정식 명칭 **Multi Thread(Multi-Testing)**  
하나 돌리고 끊고 다른거 돌리고 끊고 하나돌리고 끊고 를 반복해서 빠르게 실행하면 동시 다발 처럼 보이게 만드는 것.

  1. **공유**  
  Thread는 o/s의 자원을 공유할 수 있다. 하지만 data를 공유할때 문제가 발생한다.
  2. **Data를 주고 받을 때 동기화의 문제 발생.**  
  data에 대한 신뢰성이 떨어질 뿐더러 하나의 소스를 여러명이 열었을때 문제가 발생한다. 
  왜 문제가 발생하냐면 다같이 열리면 수정을 했을때 다같이 수정 권한이 있기 때문이다. 문제를 해결하기 위해 `synchronized` 라는 키워드를 사용한다. 
  
  3. **synchronized**   
    먼저 들어간 사람이 수정 권한(key)를 잡을수 있게 설정을 함으로 동기화 문제를 해결할수 있다. 즉 두사람이 같은 데이터를 건들지 못하게 막아 놓음으로서 한사람만 권한을 주는 것.  
    

  4. **O/H**  
    메서드에 synchronized를 주게되면 권한을 그 한 객체에만 가지고 있고 나머지는 synchronized pool에 들어가므로 과부화가 걸리게 된다. 그것을 방지하기에 key는 인스턴스에 생성해야 한다. 그럼 접근 자체를 못하는것이 아니냐 라는 문제가 생기지만 아래의 해결 방안이 있다. 하지만 완벽한 해결 방안이라고 할수는 없다. 
  5. **synchronized Block**    
    일정 영역만 지정하여 s(tihs)를 걸어놓는 해결 방안이 있다. 
  6. **Deadlock**  
    오버 헤드가 걸렸을 시 언젠가 폴에서 빠져나올 방법은 있지만 개발자의 실수로 프로그램은 돌아가지만 실행이 멈춘것 처럼 보여지는 현상을 데드락 현상이라 한다.?

### Thread 구현하는 설명론
`start()`가 `run()`를 실행시켜주는데 `run()`가 Thread에 있으니까 상속을 받아야 하고 그안에 내가 `run()`가 있지만 overriding 해서 `start()`를 호출하면 `run()`이 실행됨으로 [runnable](#interface---runnanle)이라는 공간에 올라가게 됨

하지만 다중 상속은 불가능 하니 꼭 필요한 class를 상속하고 `runnable` 이라는 인터페이스를 구현하면 `run()` 메서드를 오버라이딩 하고 
내가 만든 class를 `Thread ___ = new myClass() `로 인스턴스화 하면 
Thread(Runnable target) 라는것에 해당하므로 start의 메서드를 사용할수 있다.

## Method
  - **start()**  
  Thread Scheduler(스레드 스케줄러) 내부에 run() 메서드를 호출함.

  - **sleep()**  
  현재 실행 중인 스레드가 지정된 밀리초 수와 지정된 초 동안 휴면(일시적으로 실행 중지)되도록 합니다. 
    >run 하고  sleepPool이라는 공간 존재하는데 그곳에 보내고 runnanle에 다시 들어간다.  
    ```java
    // AfterThreadRunnable.java

        public void run() {
            for (int i = 1; i < 100; i++) {
                System.out.println(name + " : " + i );
    //            /*
                // sleep() ==> API 확인
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
    //            */
            }
        }
    ```
  - **setPriority()**   
    `runnable`의 구조는 큐 구조로 되어있다. 멀티 큐 구조가 되어있고 그 구조에 우선순위를 정할수 있다. **(Thread Field API Check)**
