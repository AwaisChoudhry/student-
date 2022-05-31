import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Managment System");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        Scanner scan =new Scanner(System.in);


        while(true) {
            System.out.println("Press 1 to Add student ");
            System.out.println("Press 2 to Delete student ");
            System.out.println("Press 3 to Display student ");
            System.out.println("Press 4 for enter course name ");
            System.out.println("Press 5 for Updation ");
            System.out.println("Press 6 for show student and course details ");
            System.out.println("Press 7 to add student id according to courses ");
            System.out.println("Press 8 for courses Updation ");
            System.out.println("Press 9 for courses Updation ");
            System.out.println("Press 10 for delete id from registration ");

            int c = scan.nextInt();

            int studentid = 0;
            if (c == 1) {
// add student


                System.out.println("Enter First Name = ");
                String fname = scan.next();

                System.out.println("Enter Last Name = ");
                String lname = scan.next();

                System.out.println("Enter City = ");
                String city = scan.next();


                student st = new student(fname, lname, city);
                st.setStudentId(studentid);
                st.setFname(fname);
                st.setLname(lname);
                st.setCity(city);

             boolean answer = studentdio.insertstudenttodb(st);
                if (answer)
                {
                    System.out.println("Student Added Successfully");
                }
                else
                {
                    System.out.println("Some thing went wrong");
                }

                System.out.println(st);
            } else if (c == 2) {
                //delete student

                System.out.println("Enter id to delete student = ");
                int userid = scan.nextInt();
                student st = new student(userid);
                studentdio.deletestudent(st);
                System.out.println();

            } else if (c == 3) {
                //Display
                studentdio.showallstudent();

            } else if (c == 4) {
                // coursename
                System.out.println("Enter Courses Name = ");
                String cname = scan.next();

                courses ct = new courses(cname);

                boolean answer = coursedio.insertcourseodb(ct);
                if (answer) {
                    System.out.println("Student Added Successfully");
                } else {
                    System.out.println("Some thing went wrong");
                }

                System.out.println(ct);


            } else if (c == 5) {
// updation
                System.out.println("enter id");
                studentid = scan.nextInt();

                System.out.println("Enter First Name = ");
                String fname = scan.next();

                System.out.println("Enter Last Name = ");
                String lname = scan.next();

                System.out.println("Enter City = ");
                String city = scan.next();


                student at = new student(studentid,fname,lname,city);


                boolean answer = studentdio.alterstudenttodb(at);
                if (answer) {
                    System.out.println("Student Added Successfully");
                } else {
                    System.out.println("Some thing went wrong");
                }

                System.out.println(at);
            } else if (c == 6) {
                System.out.println("Enter id of the student");
                int userid = scan.nextInt();


                studentdio.showStudentjoin(userid);

            } else if (c == 7) {
                System.out.println("Enter student id = ");
                int sid = scan.nextInt();
                int n=0;
                System.out.println("enter the number of courses you want to insert");
                n=scan.nextInt();
                for(int i = 0;i<n;i++) {
                    System.out.println("Enter course id = ");
                    int courseid = scan.nextInt();


                    Registration rt = new Registration(sid, courseid);


                    boolean answer = registrationdio.rejistrationbd(rt);

                    if (answer) {
                        System.out.println("Student Added Successfully");
                    } else {
                        System.out.println("Some thing went wrong");
                    }

                    System.out.println(rt);
                }
            }
            else if (c == 8) {
// updation
                System.out.println("enter course id");
                int courseid = scan.nextInt();

                System.out.println("Enter Course Name = ");
                String coursename = scan.next();




                courses at = new courses(courseid);
                boolean answer = coursedio.altercourseodb(at);



                if (answer) {
                    System.out.println("Student Added Successfully");
                } else {
                    System.out.println("Some thing went wrong");
                }

                System.out.println(at);
            }
            else if (c == 9) {
                //delete student

                System.out.println("Enter id to delete student = ");
                int userid = scan.nextInt();
                courses st = new courses(userid);
                coursedio.deletecourses(st);
                System.out.println();

            }
            else if (c == 10) {
                //delete student

                System.out.println("Enter id to delete from Registration = ");
                int userid = scan.nextInt();
                Registration st = new Registration(userid);
                registrationdio.deleteRegistration(st);
                System.out.println();

            }
            else {
                break;
            }

            System.out.println("thankyou");
        }


    }
}
