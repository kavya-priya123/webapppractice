//form data entered into table directly using 1 html(Signup1.html),1servlet(Signup1Servlet.java)
package ai.jobiak.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Signup1Servlet
 */
@WebServlet("/signuptest")
public class Signup1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Signup1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    private Connection connect()
    {
    	String url="jdbc:mysql://localhost:3306/world";
    	String userName="root";
    	String password="admin";
    	Connection con=null;
    	try
    	{
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con=DriverManager.getConnection(url,userName,password);
    	}catch(SQLException e) {
    		e.printStackTrace();
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	return con;
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname=request.getParameter("n1");
		String lname=request.getParameter("n2");
		String email=request.getParameter("n3");
		String password=request.getParameter("n4");
	
		Connection con=connect();
		try {
			PreparedStatement ps=con.prepareStatement("insert into signup1 values(?,?,?,?)");
			ps.setString(1,fname);
			ps.setString(2,lname);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
