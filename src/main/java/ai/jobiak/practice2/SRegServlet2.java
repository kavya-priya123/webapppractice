package ai.jobiak.practice2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SRegServlet2
 */
@WebServlet("/sregservlet2")
public class SRegServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SRegServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=(String)request.getAttribute("key1");
		out.println("<h3>Name : "+name+"<h3>");
		String dname=(String)request.getAttribute("key2");
		out.println("<h3>Father Name : "+dname+"<h3>");
		String mname=(String)request.getAttribute("key3");
		out.println("<h3>Mother Name : "+mname+"<h3>");
		String address=(String)request.getAttribute("key4");
		out.println("<h3>Address : "+address+"<h3>");
		String pincode=(String)request.getAttribute("key5");
		out.println("<h3>Pincode : "+pincode+"<h3>");
		String gender=(String)request.getAttribute("key6");
		out.println("<h3>Gender : "+gender+"<h3>");
		String dob=(String)request.getAttribute("key7");
		out.println("<h3>DateofBith : "+dob+"<h3>");
		String favcolor=(String)request.getAttribute("key8");
		out.println("<h3>Favourite Color : "+favcolor+"<h3>");
		String emailid=(String)request.getAttribute("key9");
		out.println("<h3>Email Id : "+emailid+"<h3>");
		String mobileno=(String)request.getAttribute("key10");
		out.println("<h3>Mobile No : "+mobileno+"<h3>");
	}

}
