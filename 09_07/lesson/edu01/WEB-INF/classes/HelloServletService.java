import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet{

    
    // init() => �ݹ� ���� method overriding no need

    public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        System.out.println(" servlet service() ����");
        System.out.println("Reqiest clien	t IP : " + req.getRemoteAddr()); // �ش� ���� ip Ȯ��

        // �ѱ� ó��
        // res.setContentType("text/html"); // Response �� ������ Ÿ��
        res.setContentType("text/html;charset=EUC_KR"); // Response �� ������ Ÿ��

        // 1. client Html Text ���� ���� Stream�� ����
        // OutputStream outputStream = res.getOutputStream();
        // Writer writer = new OutputStreamWriter (outputStream);
        // PrintWriter out = new PrintWriter(writer);

        // 2. PrintWriter �ν��Ͻ� ������  Encapsulation �� API ��� Stream ����
        PrintWriter out = res.getWriter();

        out.println("<html>");
        // out.println("<meta charset=\"EUC_KR\">");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("English : HelloServlet");
        out.println("<p></p>");
        out.println("Korea : ��� ����");
        out.println("</body>");
        out.println("</html>");

        out.flush(); // ������

        out.close(); // PrintWriter close
    }
	
    // destroy() => �ݹ� ���� method overriding no need

}//end of class