package myproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		
		String n= req.getParameter("name");
		out.println("Welcom"+n);
		
		out.close();
	}
}
