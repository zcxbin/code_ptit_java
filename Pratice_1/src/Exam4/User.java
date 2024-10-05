package Exam4;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to check if the login attempt is correct
    public boolean checkLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}