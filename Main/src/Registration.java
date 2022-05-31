public class Registration {

    private int id;
    private int courseid;

    public Registration(int id) {
        this.id = id;
    }

    public Registration(int id, int courseid) {
        this.id = id;
        this.courseid = courseid;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", courseid=" + courseid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }
}
