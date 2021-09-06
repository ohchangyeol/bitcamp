import java.sql.*;

public class CreateJDBC {
	
	//main
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. driver loaing OK");
		} catch (ClassNotFoundException e) {
			System.out.println("\n==> Driver Loading시  Exception 발생 \n");
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("2. Connection 인스턴스 생성 완료");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 exceprion 발생 : "+ e.getErrorCode());;
			e.printStackTrace();
		}
		
		try {
			stmt = con.createStatement();
			System.out.println("3. statement 객체 생성완료");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 exceprion 발생 : "+ e.getErrorCode());;
			e.printStackTrace();
		}
		
		// 쿼리 만들기
		String createSql =
				"CREATE TABLE firstJDBC"+
				"(no		NUMBER(3),"+
				" name		VARCHAR2(20),"+
				" email		VARCHAR2(30),"+
				" address	VARCHAR2(50) )";
		
		try {
			System.out.println(":: QUERY 전송결과 : "+ stmt.executeUpdate(createSql));
			System.out.println("4. query 전송완료");
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 : "+ e.getErrorCode() );
			e.printStackTrace();
		}
		
		try {
			if(stmt != null)	stmt.close();
			if(con != null )	con.close();
		} catch (SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 : "+ e.getErrorCode() );
			e.printStackTrace();
		}
	}//end of main

}//end of class
