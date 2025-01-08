package myPackage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/xyz")
public class Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		if(mail.equals("019shobhit@gmail.com") && pass.equals("shobhit2002")) {
//			request.setAttribute("name_key","Shobhit Chauhan");
			HttpSession ses = request.getSession();
					ses.setAttribute("name_key","Shobhit Chauhan");
			RequestDispatcher rd =  request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.print("<h3 style='color:red'> Email or Password is Inavlid </h3>");
			request.getRequestDispatcher("/index.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
