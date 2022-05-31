public class student {
    private int studentId;
    private String fname;
    private String lname;
    private String city;

    public student(int studentId) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
    }

    public student(int studentId, String fname, String lname, String city) {
        this.studentId = studentId;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
    }

    public student(String fname, String lname, String city) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentId=" + studentId +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getlname() {
        return lname;
    }
}
