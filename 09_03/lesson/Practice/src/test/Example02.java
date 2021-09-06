package test;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Example02 {
	
	public static void main(String[] args) {
		if(args.length != 3 ) {
			System.out.println("[숫자][아이디][비밀번호] 입력 부탁드립니다.");
			System.exit(0);
		}
		
		Connection con = null;
		PreparedStatement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
//		String insertSql = "INSERT INTO member VALUES ("+Integer.parseInt(args[0])+", '"+args[1]+"', '"+args[2]+"')";
		String insertSql = "INSERT INTO member VALUES (?,?,?)";
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 로그인 후 sql 인스턴스 생성
			con = DriverManager.getConnection(url,"scott","tiger");
			
			//전송 객체 생성 
			stmt = con.prepareStatement(insertSql);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setString(3, args[2]);
			
			int index = stmt.executeUpdate();
			System.out.println(index+"개 전송 완료");
			
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
