package Model;

import Model.User.User;

public class Customer extends User {
    public Customer(int userID, String name, String email, String passwordHash) {
        super(userID, name, email, passwordHash);
    }
}
