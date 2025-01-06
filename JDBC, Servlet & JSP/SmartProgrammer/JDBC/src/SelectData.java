import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:3306/jdbc_db";
        String username="root";
        String password="shobhit2002";

        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement("select * from demo ");
//        ps.setInt(1,2);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            System.out.println(id+" : "+name);
        }
        ps.close();
        con.close();
        System.out.println("done");
    }
}
