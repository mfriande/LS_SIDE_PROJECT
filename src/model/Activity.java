package model;

import java.util.Date;

public class Activity {
    //private int number; duvida entre number e id (são a mesma coisa??)
    private int aid;
    private Date date;
    private double durationTime;

    public Activity(int aid, Date date, double durationTime) {
        this.aid = aid;
        this.date = date;
        this.durationTime = durationTime;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDurationTime(double durationTime) {
        this.durationTime = durationTime;
    }

    public int getAid() {
        return this.aid;
    }

    public Date getDate() {
        return this.date;
    }

    public double getDurationTime() {
        return this.durationTime;
    }
}
