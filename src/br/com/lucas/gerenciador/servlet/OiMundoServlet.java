package br.com.lucas.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;



@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet  {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException  {
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("Oi mundo, usando servlets");
		
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
