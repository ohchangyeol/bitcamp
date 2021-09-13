import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
*	FileName : ServletDeclaration.java
*  1. init(),service(),destroy() method �ܿ� �ʿ��� Method Definition
*  2. Object Modeling
*      ==> attribute : Field(memberVariable)
*      ==> behavior : method
*/
public class ServletDeclaration extends HttpServlet	{
    
    ///service() method O/R
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=ksc5601");
		PrintWriter out = res.getWriter();
		
		// �������� ����ϴ� for��
		for(int i=0;i<10;i++){
			out.println("<< "+i+" >>�� ���<br/><hr/>");
			for(int j=0;j<10;j++){
				out.println(i+" X "+j+" = "+i*j+"<br/>");
			}
			out.println("<hr/>");
		}

    	out.println("<hr/><hr/> gugudan() method ��� ������ ����<hr/><hr/>");

		//method�� �̿��Ͽ� �������� ���
		for(int i=0;i<10;i++){
			out.println("<< "+i+" >>�� ���<br/><hr/>");
			for(int j=0;j<10;j++){
				out.println(i+" X "+j+" = "+gugudan(i,j)+"<br/>");
			}
			out.println("<hr/>");
		}
	}

	//�μ��� �Է� �޾� ���ϰ� ���� return�ϴ�  method
	public int gugudan(int i,int j){
		return i*j;
	}

}//end of class