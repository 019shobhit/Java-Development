package myPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.io.InputStream;
import org.mindrot.jbcrypt.BCrypt;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        
        String name = req.getParameter("name");
        String email = req.getParameter("mail");
        String pass = req.getParameter("pass");
        String gender = req.getParameter("gender1");

        if (name == null || email == null || pass == null || gender == null) {
            res.sendRedirect("register.jsp?error=missingFields");
            return;
        }

        String hashedPass = BCrypt.hashpw(pass, BCrypt.gensalt());

        try {
            // Load database credentials from properties file
            Properties props = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties");
            props.load(input);
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            // Establish Database Connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement("INSERT INTO register (name, email, password, gender) VALUES (?, ?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, hashedPass);
            ps.setString(4, gender);

            int i = ps.executeUpdate();

            if (i > 0) {
                res.sendRedirect("success.jsp");
            } else {
                res.sendRedirect("register.jsp?error=registrationFailed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.sendRedirect("register.jsp?error=exception&message=" + e.getMessage());
        }
    }
}
