package model;

public class Database {

    public User checkUser(User user) {
        user.setRole(Role.ADMIN);
        return user;
    }
}
