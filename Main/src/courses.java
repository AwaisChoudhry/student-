public class courses {

    private int cid;
    private String cname;

    public courses(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public courses(int cid) {
        this.cid = cid;
    }

    public courses(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "courses{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}