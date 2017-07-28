package view;

import model.*;
import java.util.*;

public class GameIOConsole implements GameIO {

    public User logIn() {
        String username, password;
        System.out.print("Ten dang nhap: ");
        Scanner scanner = new Scanner(System.in);
        username = scanner.next();
        System.out.print("Mat khau: ");
        password = scanner.next();

        return new User(username, password);
    }

    public void notifyInvalidUser() {
        System.out.println("Wrong username or password");
    }

    public void showGuestMenu() {
        System.out.println("0. Choi Game");
    }

    public int getGuestSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        System.out.println("Chon chuc nang: ");
        selection = scanner.nextInt();

        if (selection == 0) {
            return selection;
        } else {
            return -1;
        }
    }

    public void loadQuestion(Question question) {
        String content = question.getContent();
        String[] answer = question.getAnswer();

        System.out.println(content);
        System.out.println("0. " + answer[0]);
        System.out.println("1. " + answer[1]);
        System.out.println("2. " + answer[2]);
        System.out.println("3. " + answer[3]);
    }

    public void showScore(User user) {
        System.out.println("So diem ban dang co la: " + user.getScore());
    }

    public int getSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        System.out.println("Chon cau tra loi (nhap so tu 0..3 hoac so bat ki de dung choi): ");
        selection = scanner.nextInt();

        if (selection >= 0 && selection <= 3) {
            return selection;
        } else {
            return -1;
        }
    }

    public void showEndGameMessage(User user) {
        System.out.println("So diem ban danh duoc la: " + user.getScore());
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

    public void winGame() {
        System.out.println("Ban da thanh trieu phu !!!");
    }

    public void showAdminMenu() {
        System.out.println("0. Choi game");
        System.out.println("1. Them cau hoi");
    }

    public int getAdminSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        System.out.println("Chon chuc nang: ");
        selection = scanner.nextInt();

        if (selection >=0 && selection <=1) {
            return selection;
        } else {
            return -1;
        }
    }
}
