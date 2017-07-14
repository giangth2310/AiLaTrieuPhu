package model;

public class Guest extends User {

    public Guest() {
    }

    public Guest(User user) {
        super(user.getUserName(), user.getPassword());
        setRole(Role.GUEST);
    }
}
