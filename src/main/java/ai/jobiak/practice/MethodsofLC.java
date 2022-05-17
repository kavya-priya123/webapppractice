//Print the data Directly from Java Program to the Browser 
package ai.jobiak.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MethodsofLC implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		ArrayList<Integer> obj=new ArrayList<>();		//ArrayList Contains/allows Duplicate Values
		obj.add(3);
		obj.add(6);
		obj.add(9);
		for(int A:obj)
		{ 
			out.println(A);
		}

		HashMap<Integer,String> obj1=new HashMap();			//HashMap doesn't allow Duplicate Values 
		obj1.put(1,"Kavya");
		obj1.put(2,"Srilatha");
		obj1.put(3,"Ramya");
		obj1.put(4,"Divya");
		obj1.put(5,"Ramya");
		obj1.put(2,"Tom");
		obj1.put(6,"Kavya");
		
		out.println(obj1);
		
		Set<String> obj2=new HashSet<String>();				//Set doesn't allow duplicate values and elements are not returned in particular order
		obj2.add("Apple");
		obj2.add("Banana");
		obj2.add("Guava");
		obj2.add("Mango");
		
		Iterator<String> iter=obj2.iterator();
		while(iter.hasNext())
		{
			out.println(iter.next());
		}
		
		
	}

}
