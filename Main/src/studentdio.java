import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentdio {
    public static boolean insertstudenttodb(student st) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q = "INSERT INTO student ( first_name, last_name, city) VALUES (?,?,?)";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, st.getFname());
            pstmt.setString(2, st.getlname());
            pstmt.setString(3,st.getCity());





            //execute;




            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;
    }


    public static boolean deletestudent(student userid) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q = "delete from student where id =?";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,userid.getStudentId());





            //execute;
            pstmt.executeUpdate();



            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;
    }

    public static boolean showallstudent() {
        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q = "select * from student";
            Statement stmt = con.createStatement();
            ResultSet set =stmt.executeQuery(q);


            while(set.next()) {


              int id=set.getInt(1);
              String fname=set.getString(2);
                String lname=set.getString(2);
                String city=set.getString("city");

                System.out.println("ID ="+id);
                System.out.println("First Name ="+fname);
                System.out.println("Last Name ="+lname);
                System.out.println("City ="+city);
                System.out.println("****************************");

            }

            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;

    }
    // for update
    public static boolean alterstudenttodb(student at) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();


            String sql = "update student set first_name = ?,last_name = ?,city = ? where id =?";
            //prepared statment

            PreparedStatement pstmt = con.prepareStatement(sql);



            pstmt.setString(1, at.getFname());
           pstmt.setString(2, at.getlname());
           pstmt.setString(3, at.getCity());
            pstmt.setInt(4,at.getStudentId());


            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;

    }

    public static Boolean showStudentjoin (int userid)
    {

        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q=" SELECT student.ID, student.first_name,student.last_name,student.city ,courses.courseid,courses.coursename,registration.courseid FROM student INNER JOIN Registration ON registration.id=student.id INNER JOIN courses ON courses.courseid = registration.courseid where registration.id = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, userid);

            ResultSet set = pstmt.executeQuery();


            while(set.next()) {


                int id=set.getInt(1);
                String fname=set.getString(2);
                String lname=set.getString(3);
                String city=set.getString(4);
                int courseid = set.getInt(5);
                String coursename = set.getString(6);


                System.out.println("ID ="+id);
                System.out.println("First Name ="+fname);
                System.out.println("Last Name ="+lname);
                System.out.println("City ="+city);
                System.out.println("courseid ="+courseid);
                System.out.println("Coursename ="+coursename);

                System.out.println("****************************");


            }


           f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;

    }

}
