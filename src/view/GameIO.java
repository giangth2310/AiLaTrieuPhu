package view;

import model.Question;
import model.User;

public interface GameIO {
    /*
    return user voi username va mat khau duoc nguoi dung nhap vao
     */
    User logIn();

    void notifyInvalidUser();

    void loadQuestion(Question question);

    /*
    return 0..3 cac phuong an tra loi
           -1   dung cuoc choi
     */
    int getSelection();

    void showScore(User user);

    /*
    Hien thi thong bao khi tra loi het cau hoi trong database
     */
    void winGame();

    void showAdminMenu();

    /*
    return 0 choi game
           1 them cau hoi
          -1 thoat
     */
    int getAdminSelection();

    /*
    return cau hoi duoc nhap tu admin
     */
    Question takeNewQuestion();

    void showGuestMenu();

    /*
    return 0 choi game
          -1 thoat
     */
    int getGuestSelection();
}
