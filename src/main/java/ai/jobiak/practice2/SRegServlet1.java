//DISPLAY DATA FROM HTML FORM TO THE BROWSER USING INDIRECT SERVLETS (REQUEST DISPATCHER)  
package ai.jobiak.practice2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SRegServlet1
 */
@WebServlet("/sregservlet1")
public class SRegServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SRegServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		//1.Data from HTML
		String name=(String)request.getParameter("n1");
		String dname=(String)request.getParameter("n2");
		String mname=(String)request.getParameter("n3");
		String address=(String)request.getParameter("n4");
		String pincode=(String)request.getParameter("n5");
		String gender=(String)request.getParameter("n6");
		String dob=(String)request.getParameter("n7");
		String favcolor=(String)request.getParameter("n8");
		String emailid=(String)request.getParameter("n9");
		String mobileno=(String)request.getParameter("n10");
		//2.generate response
		/*
		 * out.println(name); out.println(dname); out.println(mname);
		 * out.println(address); out.println(pincode); out.println(gender);
		 * out.println(dob); out.println(favcolor); out.println(emailid);
		 * out.println(mobileno);
		 */
		//3.RequestDispatcher
		RequestDispatcher rd=request.getRequestDispatcher("sregservlet2");//inside the braces we give url of 2nd servlet i.e.SRegServlet2 url=sregservlet2
		//4.Set Data to NextServlet
		request.setAttribute("key1",name);
		request.setAttribute("key2",dname);
		request.setAttribute("key3",mname);
		request.setAttribute("key4",address);
		request.setAttribute("key5",pincode);
		request.setAttribute("key6",gender);
		request.setAttribute("key7",dob);
		request.setAttribute("key8",favcolor);
		request.setAttribute("key9",emailid);
		request.setAttribute("key10",mobileno);
		//5.call secondServlet
		rd.forward(request,response);
	}
}
