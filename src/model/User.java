package model;

public class User {

    private String username;
    private String password;
    private Role role;
    private int score = 0;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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
