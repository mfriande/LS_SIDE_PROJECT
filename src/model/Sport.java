package model;

public class Sport {
    private int sid;
    private String sname, sdescription;

    public Sport(int sid, String sname, String sdescription) {
        this.sid = sid;
        this.sname = sname;
        this.sdescription = sdescription;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String name) {
        this.sname = sname;
    }

    public void setSdescription(String sdescription) {
        this.sdescription = sdescription;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSdescription() {
        return sdescription;
    }
}
