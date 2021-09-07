import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class GetDataKr extends HttpServlet{

    public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

        res.setContentType("text/html;charset=EUC_KR"); // Response �� ������ Ÿ��
        PrintWriter out = res.getWriter();

        String ClientName = req.getParameter("name");
        String ClientAddr = req.getParameter("addr");

        String ClientNameKr = this.convertKo(ClientName);
        String ClientAddrKr = convertKo(ClientAddr);

        System.out.println(ClientNameKr + " : " +ClientAddrKr);
        out.println("<html>");
        // out.println("<meta charset=\"EUC_KR\">");
        out.println("<head><title>Hello Servlet</title></head>");
        out.println("<body>");
        
        out.println("<h2>Get Test Kr</h2>");
        out.println("<li> �̸� : "+ClientNameKr+"</li>");
        out.println("<li> �ּ� : "+ClientAddrKr+"</li>");

        out.println("<p></p><a href = '/edu/getDataKr.html'>�ڷ� </a>");

        out.println("</body>");
        out.println("</html>");

        out.flush(); // ������

        out.close(); // PrintWriter close
    }
	
    //method
    private String convertKo(String paramValue) {
        String convertParamValue = null;
        try {
            byte[] b = paramValue.getBytes("8859_1");
            convertParamValue = new String(b,"EUC_KR");
        } catch (UnsupportedEncodingException uee) {
            System.out.println("�ѱ� ��ȯ�� exception �߻�");
            uee.printStackTrace();
        }
        return convertParamValue;
    }
}//end of class