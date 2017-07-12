import java.util.Scanner;

public class GameIO {

    User logIn() {
        User user = new User();

        String userName, password;
        System.out.print("Ten dang nhap: ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.print("Mat khau: ");
        password = scanner.next();

        return new User(userName, password);
    }
}
