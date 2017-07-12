
public class AiLaTrieuPhu {

    public static void main(String[] args) {
        AiLaTrieuPhu game = new AiLaTrieuPhu();
        GameIO gameIO = new GameIO();
        Database database = new Database();

        User user = gameIO.logIn();
        database.checkUser(user);
        System.out.println(user.getRole());

        if (user.getRole() == Role.admin) {
            //xu ly voi admin
        } else {
            user.play();
        }
    }
}
