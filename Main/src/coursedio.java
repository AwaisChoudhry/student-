import java.sql.Connection;
import java.sql.PreparedStatement;

public class coursedio {

        public static boolean insertcourseodb(courses ct) {
            Boolean f = false;
            try {
                Connection con = connection.creatc();
                String q = "insert into courses (coursename) value (?)";
                //prepared statment


                PreparedStatement pstmt = con.prepareStatement(q);
                pstmt.setString(1, ct.getCname());

                //execute;
                pstmt.executeUpdate();
                f = true;

            } catch (Exception e) {
                e.printStackTrace();
            }

            return f;

        }

    public static boolean altercourseodb(courses c) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();


            String sql = "update courses set coursename = ? where courseid =?";
            //prepared statment

            PreparedStatement pstmt = con.prepareStatement(sql);



            pstmt.setInt(1,c.getCid());
            pstmt.setString(2,c.getCname());


            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;

    }
    public static boolean deletecourses(courses courseid) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q = "delete from courses where id =?";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,courseid.getCid());





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


}

