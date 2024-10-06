package Model.Seat;

public class Seat {
    private int seatID;
    private int trainID;
    private String classType;
    private int availability;

    public Seat(int seatID, int trainID, String classType, int availability) {
        this.seatID = seatID;
        this.trainID = trainID;
        this.classType = classType;
        this.availability = availability;
    }

    public int getSeatID() {
        return seatID;
    }

    public void setSeatID(int seatID) {
        this.seatID = seatID;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatID=" + seatID +
                ", trainID=" + trainID +
                ", classType='" + classType + '\'' +
                ", availability=" + availability +
                '}';
    }
}
