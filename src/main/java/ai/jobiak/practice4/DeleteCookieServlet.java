package ai.jobiak.practice4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCookieServlet
 */
@WebServlet("/DeleteCookieServlet")
public class DeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//get cookie
		Cookie c[]=request.getCookies();
		if(c!=null)
		{
			for(int i=0;i<c.length;i++)
			{
				//deleting cookies
				c[i].setMaxAge(0);//changing the maximum age to 0 Seconds
				response.addCookie(c[i]);//adding cookie in the response
			}
		}
		out.println("<h3>Cookie deleted Successfully</h3>");
	}
}
