package feedback_app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String number = request.getParameter("phone");
		String msg = request.getParameter("msg");
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.print("<h1>Feedback Form submited Successfully</h1>");
//		writer.print("chl gya bhai");
		writer.print("""
				<h2> Your form details that you have Submitted</h2>
				<h3> Email Address: %s </h3>
				<h3> Phone Number: %s</h3>
				<h3> Feedback Message : %s </h3>
				+ """.formatted(email,number,msg));
	}

}
