package Service.User;

import Model.Booking.Booking;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("User is doing the Registration");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In : " +user.toString());
    }

    @Override
    public void viewPNRStatus(User user, Booking booking) {
        System.out.println("User is Viewing the PNR Status for the User" +user.toString() + " and For Booking : " +booking.toString());
    }

    @Override
    public void cancelTicket(User user, Booking booking) {
        System.out.println("Cancelling the Ticket: " + booking.toString() + " For the User : " +user.toString());
    }
}
