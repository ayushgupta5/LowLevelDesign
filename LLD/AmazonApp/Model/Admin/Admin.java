package Model.Admin;

import Model.User.User;

public class Admin extends User {
    public Admin(int userID, String name, String email, String passwordHash) {
        super(userID, name, email, passwordHash);
    }
}
