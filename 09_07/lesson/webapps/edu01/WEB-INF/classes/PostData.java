import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class PostData extends HttpServlet{

    public void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

		req.setCharacterEncoding("EUC_KR");

        res.setContentType("text/html;charset=EUC_KR"); // Response �� ������ Ÿ��
        PrintWriter out = res.getWriter();

        String ClientName = req.getParameter("name");
        String ClientAddr = req.getParameter("addr");


        System.out.println(ClientName + " : " +ClientAddr);
        out.println("<html>");

        out.println("<head><title>Post Data</title></head>");
        out.println("<body>");
        
        out.println("<h2>Post Test</h2>");
        out.println("<li> �̸� : "+ClientName+"</li>");
        out.println("<li> �ּ� : "+ClientAddr+"</li>");

        out.println("<p></p><a href = '/edu/postData.html'>�ڷ� </a>");

        out.println("</body>");
        out.println("</html>");

        out.flush(); // ������

        out.close(); // PrintWriter close
    }
	
    //method
   
}//end of class