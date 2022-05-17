package ai.jobiak.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet2
 */
@WebServlet("/signupservlet2")
public class SignupServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=(String)request.getAttribute("key1");
		out.println("<h3>First Name : "+fname+"<h3>");
		String lname=(String)request.getAttribute("key2");
		out.println("<h3>Last Name : "+lname+"<h3>");
		String email=(String)request.getAttribute("key3");
		out.println("<h3>Email : "+email+"<h3>");
		String password=(String)request.getAttribute("key4");
		out.println("<h3>Password : "+password+"<h3>");
	}

}
