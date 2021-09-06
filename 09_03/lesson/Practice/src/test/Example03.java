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
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// �α��� �� sql �ν��Ͻ� ����
			con = DriverManager.getConnection(url,"scott","tiger");
//			System.out.println("�α���");
			//���� ��ü ���� 
			stmt = con.prepareStatement(deleteSql);
			
			stmt.setString(1,args[0]);
//			System.out.println("�ν��Ͻ� ����");
//			������ �۾�
			
			int index = stmt.executeUpdate();
			System.out.println(index+"�� ���� �Ϸ�");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("JDBC ���� ���� :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)	stmt.close();
				if(con != null )	con.close();
			} catch (SQLException e) {
				System.out.println("JDBC ���� ���� :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
	}

}
