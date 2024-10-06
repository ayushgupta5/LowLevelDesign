package Model.Traffic;

public class Traffic {
    private String trafficStatus;
    private String place;

    public Traffic(String trafficStatus, String place) {
        this.trafficStatus = trafficStatus;
        this.place = place;
    }

    public String getTrafficStatus() {
        return trafficStatus;
    }

    public void setTrafficStatus(String trafficStatus) {
        this.trafficStatus = trafficStatus;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Traffic{" +
                "trafficStatus='" + trafficStatus + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
