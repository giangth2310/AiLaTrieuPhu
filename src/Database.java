
public class Database {

    User checkUser(User user) {
        user.setRole(Role.guest);
        return user;
    }
}
