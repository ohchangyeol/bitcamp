package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		ResultSet rs =null ;
		
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 로그인 후 sql 인스턴스 생성
			con = DriverManager.getConnection(url,"scott","tiger");
//			System.out.println("로그인");
			//전송 객체 생성 
			stmt = con.prepareStatement("SELECT * FROM member");
//			System.out.println("인스턴스 생성");
//			수행할 작업
			
			rs = stmt.executeQuery(); 
			
			while (rs.next()){
				int productNo = rs.getInt("no");
				String productId = rs.getString("id");
				String productPwd = rs.getString("pwd");
				System.out.println("번 호 : "+productNo + " id : "+productId+" pwd : " + productPwd);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)	stmt.close();
				if(con != null )	con.close();
				if(rs != null )	 	rs.close();
			} catch (SQLException e) {
				System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
	}
}
