package view;

import model.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameIOSwing extends JFrame implements GameIO {
    private JPanel loginPanel;
    private JPanel westLabelPanel;
    private JPanel eastTextFieldPanel;
    private JPanel southButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton loginButton;

    private String username;
    private String password;

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public GameIOSwing() {
//        setContentPane(new GameIOSwing().getContentPane());
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        pack();
//        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                username = usernameTextField.getText();
                password = passwordTextField.getText();
                JOptionPane.showMessageDialog(null, username + password);
            }
        });

    }
    public User logIn() {
        return new User(username, password);
    }

    public void loadQuestion(Question question) {

    }

    public int getSelection() {
        return 0;
    }

    public void showScore(User user) {}

    public Question takeNewQuestion() {
        String content="j";
        String[] answer = new String[4];
        byte rightAnswer= 1;

        return new Question(content, answer, rightAnswer);
    }

    public void winGame() {}

    public void showAdminMenu(){}

    public int getAdminSelection() {return 1;}


}
