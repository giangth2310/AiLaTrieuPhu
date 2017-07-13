package controller;

import model.*;
import view.*;

public class AiLaTrieuPhu {

    public static void main(String[] args) {
        AiLaTrieuPhu game = new AiLaTrieuPhu();
        GameIO gameIO = new GameIO();
        Database database = new Database();

        User user = gameIO.logIn();
        user = database.checkUser(user);
        System.out.println(user.getRole());

        if (user.getRole() == Role.ADMIN) {
            //xu ly voi ADMIN
        } else {
            user.play();
        }
    }
}
