import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class registrationdio {


    public static boolean rejistrationbd(Registration rt)

    {
        Boolean f = false;
        try {

            Connection con = connection.creatc();
            String q = "INSERT INTO Registration (id,courseid) VALUES (?,?)";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,rt.getId());

                pstmt.setInt(2, rt.getCourseid());



            //execute;
//            pstmt.executeUpdate();



            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;
    }

    public static boolean deleteRegistration(Registration id) {
        Boolean f = false;
        try {
            Connection con = connection.creatc();
            String q = "delete from registration where id =?";

            //prepared statment


            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1,id.getId());






            //execute;
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f ;
    }

        }