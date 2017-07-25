package controller;

import model.*;
import view.*;

public class AiLaTrieuPhu {

    private static GameIO gameIO = new GameIOConsole();
    private static Database database = new Database();

    public static void main(String[] args) {
        AiLaTrieuPhu game = new AiLaTrieuPhu();

        User userEnter, userLogIn;
        boolean isValid = false;
        do {
            userEnter = gameIO.logIn();
            userLogIn = database.checkUser(userEnter);
            if (userLogIn.getRole() != null) {
                isValid = true;
            } else {
                gameIO.notifyInvalidUser();
            }
        } while (! isValid);

        if (userLogIn.getRole() == Role.ADMIN) {
            game.adminProcess(userLogIn);
        } else {
            game.guestProcess(userLogIn);
        }
    }

    private void adminProcess(User user) {
        boolean isRunning = true;
        while (isRunning) {
            gameIO.showAdminMenu();

            switch (gameIO.getAdminSelection()) {
                case -1:
                    isRunning = false;
                    break;
                case 0:
                    play(user);
                    break;
                case 1:
                    Question question = gameIO.takeNewQuestion();
                    database.addQuestion(question);
                    break;
            }
        }
    }

    private void guestProcess(User user) {
        boolean isRunning = true;
        while (isRunning) {
            gameIO.showGuestMenu();

            switch (gameIO.getGuestSelection()) {
                case 0:
                    play(user);
                    break;
                case -1:
                    isRunning = false;
                    break;
            }
        }
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
