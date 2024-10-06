package Model.Route;

public class Route {
    //startPlace, endPlace, distance, estimatedTime
    private String startPlace;
    private String endPlace;
    private double distance;
    private double estimatedTime;

    public Route(String startPlace, String endPlace, double distance, double estimatedTime) {
        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(double estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "Route{" +
                "startPlace='" + startPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                ", distance=" + distance +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}

