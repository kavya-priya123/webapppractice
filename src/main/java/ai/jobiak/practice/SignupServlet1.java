package ai.jobiak.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet1
 */
@WebServlet("/signupservlet1")
public class SignupServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		//1.data from html
		String fname=request.getParameter("n1");
		String lname=request.getParameter("n2");
		String email=request.getParameter("n3");
		String password=request.getParameter("n4");
		//2.generate response
		out.println(fname);
		out.println(lname);
		out.println(email);
		out.println(password);
		//3.RD
		RequestDispatcher rd=request.getRequestDispatcher("/signupservlet2");
		//4.set data to next servlet
		request.setAttribute("key1",fname);
		request.setAttribute("key2",lname);
		request.setAttribute("key3",email);
		request.setAttribute("key4",password);
		//5.call
		rd.forward(request,response);
		
	}

	}



