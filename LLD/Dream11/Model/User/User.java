package Model.User;

public class User {
    private int userID;
    private String userName;
    private String passwordHash;
    private String walletBalance;

    public User(int userID, String userName, String passwordHash, String walletBalance) {
        this.userID = userID;
        this.userName = userName;
        this.passwordHash = passwordHash;
        this.walletBalance = walletBalance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(String walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", walletBalance='" + walletBalance + '\'' +
                '}';
    }
}
