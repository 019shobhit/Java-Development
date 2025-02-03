package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setting the response type to HTML
        response.setContentType("text/html");

        // Adding security headers
        response.setHeader("X-Content-Type-Options", "nosniff");
        response.setHeader("X-XSS-Protection", "1; mode=block");

        try (var writer = response.getWriter()) {
            // Retrieve all cookies from the request
            Cookie[] cookies = request.getCookies();
            String nameValue = null;
            String idValue = null;

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    // Look for cookies with the names "name" and "id"
                    if ("name".equals(cookie.getName())) {
                        nameValue = cookie.getValue();
                    } else if ("id".equals(cookie.getName())) {
                        idValue = cookie.getValue();
                    }
                }
            }
            HttpSession session = request.getSession();
            String key1 =(String) session.getAttribute("k1");
            String key2 =(String) session.getAttribute("k2");
            
            writer.println("<h1>Key 1 is : "+key1+"</h1>");
            writer.println("<h1>Key 2 is : "+key2+"</h1>");

            // Display the retrieved values
            if (nameValue != null && idValue != null) {
                writer.println("<h1>Welcome: " + nameValue + "</h1>");
                writer.println("<h1>Your ID is: " + idValue + "</h1>");
            } else {
                writer.println("<h1>Required cookies are missing.</h1>");
            }
        }
    }
}
