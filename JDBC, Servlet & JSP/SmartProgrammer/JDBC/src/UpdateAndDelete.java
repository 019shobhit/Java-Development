import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateAndDelete {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Everything ok");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","shobhit2002");
//        PreparedStatement ps = con.prepareStatement("update demo set name = ? where id = ?");
        PreparedStatement ps = con.prepareStatement("delete from demo where id = ?");
        ps.setInt(1,1);
        int i = ps.executeUpdate();
        if(i >0){
            System.out.println("data insertion succesfully");
        }
        else{
            System.out.println("failed to insert data");
        }

    }
}
