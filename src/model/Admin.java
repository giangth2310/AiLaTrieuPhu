package model;

import java.util.*;

public class Admin extends User {

    public Admin() {
    }

    public Admin(User user) {
        super(user.getUserName(), user.getPassword());
        setRole(Role.ADMIN);
    }

    public void showMenu() {
        System.out.println("0. Choi game");
        System.out.println("1. Them cau hoi");
    }

    public int getSelction() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            System.out.println("Chon chuc nang: ");
            selection = scanner.nextInt();
        } while (selection < 0 || selection > 1);

        return selection;
    }
}
