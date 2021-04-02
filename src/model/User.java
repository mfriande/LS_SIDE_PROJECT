package model;

public class User {
    private int uid;
    private final String uname;// (final) -> Em principio o utilizador nao muda de nome frequentemente???
    private String uemail;

    public User(int id, String name, String email){
        this.uid = id;
        this.uname = name;
        this.uemail = email;
    }

    public void setUid(int uid){
        this.uid = uid;
    }

    public void setUemail(String uemail){
        this.uemail = uemail;
    }

    public int getUid(){
        return this.uid;
    }

    public String getUname(){
        return this.uname;
    }

    public String getUemail(){
        return this.uemail;
    }
}
