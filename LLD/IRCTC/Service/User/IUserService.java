package Service.User;

import Model.Booking.Booking;
import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
    void viewPNRStatus(User user, Booking booking);
    void cancelTicket(User user, Booking booking);
}
