package test;

import java.sql.*;
public class Example01 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String createSql = 
				"CREATE TABLE member ("
				+ "no          NUMBER,"
				+ "id          VARCHAR2(10),"
				+ "pwd         VARCHAR2(10) )";
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 로그인 후 sql 인스턴스 생성
			con = DriverManager.getConnection(url,"scott","tiger");
			
			//전송 객체 생성 
			pstmt = con.prepareStatement(createSql);
			
			System.out.println(pstmt.executeUpdate(createSql)+"개 전송 완료");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null )	con.close();
			} catch (SQLException e) {
				System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
		
	}

}
