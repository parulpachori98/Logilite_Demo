package myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	 {
		System.out.println("Request successfully");
	   res.setContentType("text/html");
	   PrintWriter out=res.getWriter();
	   
	   String n=req.getParameter("name");
	   String p=req.getParameter("password");
	   
	   if(p.equals("ait"))
	   {
		   RequestDispatcher rd= req.getRequestDispatcher("servlet2");
		   rd.forward(req, res);
	   }
	   else
	   {
		   out.println("Password is incorrect");
		   RequestDispatcher rd1=req.getRequestDispatcher("index.html");
	   }
	   out.print("Hello World");
	   out.close();
	   
	   }
}
