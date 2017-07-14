package model;

import view.GameIO;

public class User {

    private String userName;
    private String password;
    private Role role;
    private int score = 0;

    public User() {}

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getScore() {
        return score;
    }

    public void scored() {
        score += 1;
    }
}
