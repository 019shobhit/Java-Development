package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setting the response type to HTML
        response.setContentType("text/html");

        // Define a name and create cookies
        String name = "Shobhit";
        String userId = "1234";
        Cookie nameCookie = new Cookie("name", name);
        Cookie idCookie = new Cookie("id", userId);

        // Set the cookie lifespan
        nameCookie.setMaxAge(10 * 60); // 10 minutes
        idCookie.setMaxAge(1 * 60);    // 1 minute

        // Add security configurations to the cookies
        nameCookie.setSecure(false); // Set to true if using HTTPS
        nameCookie.setHttpOnly(true); // Prevent JavaScript access

        idCookie.setSecure(false);
        idCookie.setHttpOnly(true);

        // Add the cookies to the HTTP response
        response.addCookie(nameCookie);
        response.addCookie(idCookie);
        
        HttpSession session = request.getSession();
        session.setAttribute("k1","kya hall hai");
        session.setAttribute("k2", "vanshi");
        session.setMaxInactiveInterval(10*60);

        // Send response to the client
        response.getWriter().println("<h1>Cookie has been set for: " + name + "</h1>");
        response.getWriter().println("<h1>ID has been set for: " + userId + "</h1>");
    }
}
