package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		String deleteSql = "DELETE FROM member WHERE id=?";
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 로그인 후 sql 인스턴스 생성
			con = DriverManager.getConnection(url,"scott","tiger");
//			System.out.println("로그인");
			//전송 객체 생성 
			stmt = con.prepareStatement(deleteSql);
			
			stmt.setString(1,args[0]);
//			System.out.println("인스턴스 생성");
//			수행할 작업
			
			int index = stmt.executeUpdate();
			System.out.println(index+"개 삭제 완료");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)	stmt.close();
				if(con != null )	con.close();
			} catch (SQLException e) {
				System.out.println("JDBC 절차 오류 :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
	}

}
