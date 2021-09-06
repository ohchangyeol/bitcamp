# 09_03

## 용어 정리 
	third party ( 서드 파티 )
	driver

# JDBC

## third party (서드파티) 
독자적으로 특정 플랫폼의 관련 제품이나 소프트웨어
>Oracle Driver JDBC 같은 서드파트를 잡기위해 classpath를 잡는다

## 127.0.0.1
자기 자신을 가르치는 IP 

## Properties 
string으로만 이루어진 map구조의 class

## JDBC 절차

- Connection - db를 사용하려면 로그인(id , pwd, ip )를 입력해야는 것을 추상

- Statement - SQL 전송 하는 것을 추상

- ResultSet -  확인을 추상.



---

```java
public class ConnectionTest01{
	///Main Method
	public static void main(String[] args) throws Exception{

		//DB에 로그인 접속정보
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="scott";
		String pwd = "tiger";

		//1.단계  connection :: login 과정
		//1.1 OracleDriver  instance 생성
		//OracleDriver od = new OracleDriver();

		//1.2 oracle에 접속 정보를 갖는  properties instance 생성 
		//Properties info = new Properties();
		//info.put("user",user);
		//info.put("password",pwd);

		//1.3OracleDriver intance를 사용  Connection instance 생성
		//Connection con = od.connect(url,info); 
		
		//인터페이스 기반 비 종속적인 db

		// Dirver 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,user,pwd);

		//2단계 QUERY (SELECT * FROM product) 전송단계 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM product"); 

		//3단계 결과 확인
		rs.next();   

		String productName = rs.getString("p_name");
		//String productName = rs.getString(1);
		int productPrice = rs.getInt("p_price");
		//int productPrice = rs.getInt(2);

		System.out.println("상품명 : "+productName);
		System.out.println("가   격 : "+productPrice);

		//각각의 객체를 close한다.public class ConnectionTest01{
   
	///Main Method
	public static void main(String[] args) throws Exception{

		//DB에 로그인 접속정보
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="scott";
		String pwd = "tiger";

		//인터페이스 기반 비 종속적인 db DriberManager 생성
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//1.단계  connection :: login 과정
		Connection con = DriverManager.getConnection(url,user,pwd);

		//2단계 QUERY (SELECT * FROM product) 전송단계 
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM product"); 

		//3단계 결과 확인
		rs.next();   

		String productName = rs.getString("p_name");
		int productPrice = rs.getInt("p_price");

		System.out.println("상품명 : "+productName);
		System.out.println("가   격 : "+productPrice);

		rs.close();
		stmt.close();
		con.close();

	}//end of main
}//end of class
```

## ResultSet.next() 
커서 이동  
여기서 말하는 커서란 ResultSet 안에 들어있는 객체를 가져올수 있는 행의 위치를 말함    
처음 커서의 위치는 컬럼명을 가르치기에 한칸 이동 후 찾아볼수 있다.  
리턴타입은 boolean 이며 다음행의 결과물이 있으면 true 없으면 false 를 리턴.

