package controller;

import model.*;
import view.*;

public class AiLaTrieuPhu {

    private static GameIO gameIO = new GameIOConsole();
    private static Database database = new Database();

    public static void main(String[] args) {
        AiLaTrieuPhu game = new AiLaTrieuPhu();

        User user;
        do {
            user = gameIO.logIn();
            user = database.checkUser(user);
        } while (user.getRole() == null);

        if (user.getRole() == Role.ADMIN) {
            game.adminProcess(user);
        } else {
            game.guestProcess(user);
        }
    }

    private void adminProcess(User user) {
        gameIO.showAdminMenu();

        switch (gameIO.getAdminSelection()) {
            case 0:
                play(user);
                break;
            case 1:
                Question question = gameIO.takeNewQuestion();
                database.addQuestion(question);
                break;
        }
    }

    private void guestProcess(User user) {
        play(user);
    }

    private void play(User user) {
        boolean stopPlaying = false;

        while (! stopPlaying) {
            Question question = database.getNextQuestion();
            if (question != null) {
                gameIO.loadQuestion(question);
                int selection = gameIO.getSelection();
                if (selection == question.getRightAnswer()) {
                    user.scored();
                } else {
                    stopPlaying = true;
                }
            } else {
                stopPlaying = true;
                gameIO.winGame();
            }
        }

        gameIO.showScore(user);
    }
}
