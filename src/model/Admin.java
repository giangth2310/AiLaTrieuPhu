package model;

import java.util.*;

public class Admin extends User {

    public Admin() {
    }

    public Admin(User user) {
        super(user.getUserName(), user.getPassword());
        setRole(Role.ADMIN);
    }

    public void showAdminMenu() {
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

    public Question takeNewQuestion() {
        Scanner scanner = new Scanner(System.in);
        String content;
        String[] answer = new String[4];
        byte rightAnswer;

        System.out.println("Nhap cau hoi: ");
        content = scanner.nextLine();
        System.out.println("Nhap 4 cau tra loi: ");
        answer[0] = scanner.nextLine();
        answer[1] = scanner.nextLine();
        answer[2] = scanner.nextLine();
        answer[3] = scanner.nextLine();
        System.out.println("Nhap cau tra loi dung (0..3): ");
        rightAnswer = scanner.nextByte();

        return new Question(content, answer, rightAnswer);
    }
}
