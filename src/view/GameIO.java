package view;

import model.Question;
import model.User;

public interface GameIO {
    public User logIn();

    public void loadQuestion(Question question);

    public int getSelection();

    public void showScore(User user);

    public Question takeNewQuestion();

    public void winGame();

    public void showAdminMenu();

    public int getSelction();
}
