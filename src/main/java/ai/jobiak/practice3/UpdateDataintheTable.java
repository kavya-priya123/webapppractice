package ai.jobiak.practice3;

import java.io.IOException;
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
 * Servlet implementation class UpdateDataintheTable
 */
@WebServlet("/updatedatainthetable")
public class UpdateDataintheTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDataintheTable() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    private Connection connect() throws ClassNotFoundException, SQLException
    {
    	String url="jdbc:mysql://localhost:3306/world";
    	String userName="root";
    	String password="admin";
    	Connection con=null;
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	con=DriverManager.getConnection(url,userName,password);
    	return con;
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con;
		try {
				con = connect();
				PreparedStatement ps=con.prepareStatement("UPDATE SET empname='Alice' FROM employeedata where empname='Ramya'");
				ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
