import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServletService extends HttpServlet{

    
    // init() => 금번 예제 method overriding no need

    public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        System.out.println(" servlet service() 시작");
        System.out.println("Reqiest clien	t IP : " + req.getRemoteAddr()); // 해당 접속 ip 확인

        // 한글 처리
        // res.setContentType("text/html"); // Response 할 데이터 타입
        res.setContentType("text/html;charset=EUC_KR"); // Response 할 데이터 타입

        // 1. client Html Text 전송 위한 Stream을 생성
        // OutputStream outputStream = res.getOutputStream();
        // Writer writer = new OutputStreamWriter (outputStream);
        // PrintWriter out = new PrintWriter(writer);

        // 2. PrintWriter 인스턴스 생성을  Encapsulation 한 API 사용 Stream 생성
        PrintWriter out = res.getWriter();

        out.println("<html>");
        // out.println("<meta charset=\"EUC_KR\">");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        out.println("English : HelloServlet");
        out.println("<p></p>");
        out.println("Korea : 헬로 서블릿");
        out.println("</body>");
        out.println("</html>");

        out.flush(); // 보내기

        out.close(); // PrintWriter close
    }
	
    // destroy() => 금번 예제 method overriding no need

}//end of class