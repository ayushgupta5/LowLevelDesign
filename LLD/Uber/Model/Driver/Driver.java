package Model.Driver;

import Model.User.User;

public class Driver extends User {
    private String licenseNumber;
    private String vehicleDetails;
    private String availabilityStatus;

    public Driver(int userID, String name, String email, String phone, String role, String licenseNumber, String vehicleDetails, String availabilityStatus) {
        super(userID, name, email, phone, role);
        this.licenseNumber = licenseNumber;
        this.vehicleDetails = vehicleDetails;
        this.availabilityStatus = availabilityStatus;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", vehicleDetails='" + vehicleDetails + '\'' +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }
}
