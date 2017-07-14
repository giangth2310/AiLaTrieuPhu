package view;

import model.*;
import java.util.*;

public class GameIO {

    public User logIn() {
        User user = new User();

        String userName, password;
        System.out.print("Ten dang nhap: ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
        System.out.print("Mat khau: ");
        password = scanner.next();

        return new User(userName, password);
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

    public int getSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        System.out.println("Chon cau tra loi (nhap so tu 0..3 hoac so bat ki de dung choi): ");
        selection = scanner.nextInt();

        return selection;
    }

    public void showScore(User user) {
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
}
