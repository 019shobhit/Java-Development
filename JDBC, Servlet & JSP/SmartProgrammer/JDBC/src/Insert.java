import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Everything ok");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","shobhit2002");
        PreparedStatement ps = con.prepareStatement("insert into demo values(?,?);");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String y = sc.nextLine();
        ps.setInt(1,x);
        ps.setString(2,y);
        int rest = ps.executeUpdate();
        if(rest >0){
            System.out.println("data insertion succesfully");
        }
        else{
            System.out.println("failed to insert data");
        }


    }
}