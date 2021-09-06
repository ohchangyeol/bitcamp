08_24 수업 정리
===

## 용어 정리 할것들
- parsing (파싱)?????
- 레퍼런스 카운터 
- Concrete Methods 
- 상수는 카멜케이스를 따르지않는다. **추가**
- Deprecated. api에서 쓰지말고 다른것을 쓰기바람
- 객체 -물리적인,개념적인,소프트적인
- 래퍼클래스(Wrapper Class)
- <> 제네릭 `<E>` 엘리먼트의 약자

---
# java 

## Consturctor에 대해서...
> 생성자를 만들지않으면 자동으로 만들어지지만 개발자가 생상자를 하나라도 오버로딩을 하면 자동으로 생성되지않는다.

**개발할 때 default의 기본 개념을 알고있는사람과 모르는사람은 큰 차이가 있다.**





## Call By Reference
> 레퍼런스의 참조 값을 지정한다.

```java
public class CallByReferenceTest {

	///Field
	int number = 100;

	public void referenceChange(CallByReferenceTest value) {
		System.out.println("============================");
		value.number = 100 + value.number;
		System.out.println("value : "+value.number);
		System.out.println("============================");
	}

	public static void main(String[] args) {
		CallByReferenceTest call = new CallByReferenceTest();

		call.referenceChange(call);
		System.out.println("number : "+call.number);
	}
}
```

## Call by value
> 레퍼런스 안의 value를 지정한다.

```java 
public class CallByValueTest {

    ///Field
    int number = 100;

    public void valueChange(int value) {
        System.out.println("============================");
        value = value + 100;
        System.out.println("value : "+value);
        System.out.println("============================");
    }

    public static void main(String[] args) {
        CallByValueTest call = new CallByValueTest();

        call.valueChange(call.number);
        System.out.println("number : "+call.number);
    }
}
```

## Garbage collection 매커니즘
> 레퍼런스 카운터가 0인 것을 JRE가 Garbage로 인식하고 바로 삭제에 들어간다.

## 문자열 병합에 대해서...
- String - 정적   
 불변? 레퍼런스 끊고 다시 새로운것을 연결.

- StringBuffer - 동적  
16개 방 만들고 그 값에 동적으로 붙혔다 뗏다 할수있음 

### 어떨 때는 string이고 어떨때는 buffer일까?
그것을 간단하게 생각하자.  
짧고 간단하고 자주 합치지 않을 상태 값을 `string`  
자주 합치고 하는것 `buffer` 

### 왜?~
>자주 합치는것을 string 쓰면 가비지가많이 발생하기 때문이다.

## 인스턴스생성 제한에 대해서 ...
생성자를 접근 제어자인 `private`으로 막거나 추상클래스인 `abstract`로 제한할 수 있다.

### 엡스트랙트의 용도는 두가지????
- 추상화의 용도
- 엡스트랙트 **생성하지마!!** 라는 의미도 쓰일 수 있음.



## 래퍼클래스
> ```equals(Objcet obj );``` 에는 int 같은 (프리미티브)기본형타입은 넣을수 없다. 그 대신 `래퍼클래스`를 이용해 객체로 감쌀수 있다.

## Vector ? Array ?
 vector와 array는 무슨 차이가 있을까 ?
- Array 
   - 소프트웨어 객체
   - 같은 타입만 묶음
   - 크기변경 불가. 한번 만들어진 배열은 증가가 안됨. 그래서 초반에 잘만들어야함

- Vector  
   - 다른 데이터 타입을 넣을수 있음
   - 크기 변경 가능 

## API

### String의 method

- concat(String str)
    >앞에있는 문자열에 파라미터값을 병합
- substring(int beginIndex) **항상 숫자는 0부터시작**
    >index부터 끝까지 반환
- indexOf(String str)
    > 안에 파라미터가 시작한 index 번호



### Vector의 method

`Vector(int initialCapacity, int capacityIncrement) `  
초기값은 5개이지만 부족하면 5개씩 증가.

- capacity() 
  > 방의 개수를 int로 반환
- vector.size(); 
    > 값이 들어가있는 방의 개수
- elementAt(int index) 
    >리턴 타입은 오브젝트, 안에 뭐가 들어가있는지 몰라서 리턴할때 오브젝트로 리턴한다.
- insertElementAt(Object obj, int index) 
    > 해당 인덱스에 넣기. 대신 뒤에있는 값들이 뒤로 밀린다.
- setElementAt(Object obj, int index);
    > 해당 인덱스의 값으로 바꿔준다.
- removeElementAt(int index)
    > 해당 인덱스의 방을 지운다.

## 반복문의 Enhanced For Loop 
```java
for(반환된 값을 담는 변수 : 길이를 말하는 수){
 }
```
- 백터 나 배열 내부에 저장된값을 size() 만큼 반복, 1EA추출 후 Object에 담는다.
- array 같은 경우 length를 확인 후 길이 만큼 반복한다.
```java
for (Object obj : vector ){
  System.out.print((String)obj);
}
```

```java
public static void main (String[] args){
	int[] arr = {1,5,7,3,7};
	int leng = 10;
	for (int i : arr){
		System.out.println(i);
	}
	//for(int ex : leng){
	//	System.out.print(ex + ", ");
	//}
}
```
> error : ArrayTest.java:10: error: for-each not applicable to expression type  
> required: array or java.lang.Iterable

>> for-each의 유형에 맞지 않다.  배열에만 적용 가능하다.


## <>에 대해 ...

>데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법
- 묵시적으로 변한 객체를 명시적 캐스팅을 하지않고 형변환을 도와주는 것 . 즉 타입을 체크하고 변환이 필요 없다. 
- 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
- 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.

	|타입 |설명|
	|:------:|:------:|
	|`<T>`|Type|
	|`<E>`|Element|
	|`<K>`|Key|
	|`<V>`|Value|
	|`<N>`|Number|
 

### 1.5 이후 형변환을 사용시
```
VectorTest01refactoring.java:29: warning: [unchecked] unchecked call to add(E) as a member of the raw type Vector
```
>라는 경고메세지가 뜬다. 

>`<String>` 이라고 지정을 해주면 그 들어오는 객체는 오브젝트로 잡는것이 아닌 제네릭으로 지정해준 String 만 들어갈수 있다. 