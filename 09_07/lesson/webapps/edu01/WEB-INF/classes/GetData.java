import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetData extends HttpServlet{

    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html;charset=EUC_KR"); // Response �� ������ Ÿ��
        PrintWriter out = res.getWriter();

        String ClientName = req.getParameter("name");
        String ClientAddr = req.getParameter("addr");

        System.out.println(ClientName + " : " +ClientAddr);
        out.println("<html>");
        // out.println("<meta charset=\"EUC_KR\">");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        
        out.println("<h2>Get Test</h2>");
        out.println("<li> �̸� : "+ClientName+"</li>");
        out.println("<li> �ּ� : "+ClientAddr+"</li>");

        out.println("<p></p><a href = '/edu/getData.html'>�ڷ� </a>");

        out.println("</body>");
        out.println("</html>");

        out.flush(); // ������

        out.close(); // PrintWriter close
    }
	
    // destroy() => �ݹ� ���� method overriding no need

}//end of class