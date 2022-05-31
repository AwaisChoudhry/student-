import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    static Connection con;

    public  static Connection creatc(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "awaise1122";
            String url ="jdbc:mysql://localhost:3306/student_bio?autoReconnect=true&useSSL=false";
            // String url ="jdbc:mysql://localhost:3306/student_bio.student";
            con= DriverManager.getConnection(url,user,password);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
