package model;

public class Route {
    private int rid;
    private String startLocation, endLocation;
    private double distance; // float??

    public Route(int rid, String startLocation, String endLocation, double distance) {
        this.rid = rid;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getRid() {
        return rid;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public double getDistance() {
        return distance;
    }
}
