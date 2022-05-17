//Inserting data directly from Java program to database Table
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
 * Servlet implementation class InsertDataintoJdbc
 */
@WebServlet("/insert")
public class InsertDataintoJdbc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertDataintoJdbc() {
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
    	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		Connection con=connect();
		try {
			PreparedStatement ps=con.prepareStatement("insert into signup values(?,?,?)");
			ps.setString(1,"kavya");
			ps.setString(2,"kavya@gmail.com");
			ps.setInt(3,45637288);
			ps.executeUpdate();
			//PreparedStatement ps=con.prepareStatement("UPDATE signup SET fname='Dhanya' WHERE fname='abc'");
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
