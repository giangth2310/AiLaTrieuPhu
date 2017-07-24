package view;

import model.Question;
import model.User;

public interface GameIO {
    User logIn();

    void loadQuestion(Question question);

    int getSelection();

    void showScore(User user);

    Question takeNewQuestion();

    void winGame();

    void showAdminMenu();

    int getAdminSelection();

    void notifyInvalidUser();
}
