package lesson;

import java.sql.*;

public class DeleteJDBC {
	//main method
	public static void main(String[] args) throws Exception {
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oarcle.jdbc.driver.OarcleDriver";
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url,"scott","tiger");
			Statement stmt = con.createStatement();
			
			// DML :: DELETE
			String sql = "DELETE FROM firstJDBC WHERE no=3";
			
			//executeUpdate() : DML ����
			int i = stmt.executeUpdate(sql);
			System.out.println("delete�� record�� ���� : "+i+"���� �����Ǿ����ϴ�.");
			
			if(stmt != null) 
				stmt.close();
			if(con != null)
				con.close();
			
		}//end of main
}// end of class


	


