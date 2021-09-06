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
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// �α��� �� sql �ν��Ͻ� ����
			con = DriverManager.getConnection(url,"scott","tiger");
			
			//���� ��ü ���� 
			pstmt = con.prepareStatement(createSql);
			
			System.out.println(pstmt.executeUpdate(createSql)+"�� ���� �Ϸ�");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC ���� ���� :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null )	con.close();
			} catch (SQLException e) {
				System.out.println("JDBC ���� ���� :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
		
	}

}
