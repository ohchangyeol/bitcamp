import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetData extends HttpServlet{

    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html;charset=EUC_KR"); // Response 할 데이터 타입
        PrintWriter out = res.getWriter();

        String ClientName = req.getParameter("name");
        String ClientAddr = req.getParameter("addr");

        System.out.println(ClientName + " : " +ClientAddr);
        out.println("<html>");
        // out.println("<meta charset=\"EUC_KR\">");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        
        out.println("<h2>Get Test</h2>");
        out.println("<li> 이름 : "+ClientName+"</li>");
        out.println("<li> 주소 : "+ClientAddr+"</li>");

        out.println("<p></p><a href = '/edu/getData.html'>뒤로 </a>");

        out.println("</body>");
        out.println("</html>");

        out.flush(); // 보내기

        out.close(); // PrintWriter close
    }
	
    // destroy() => 금번 예제 method overriding no need

}//end of class