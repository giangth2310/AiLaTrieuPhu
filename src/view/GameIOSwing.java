package view;

import model.Question;
import model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GameIOSwing extends JFrame implements GameIO {
    private JPanel rootPanel;
    private JButton logInButton;
    private JTextField usernameTextField;
    private JPasswordField passwordField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPanel logInPanel;
    private JPanel adminSelectionPanel;
    private JButton adminPlayButton;
    private JButton addQuestionsButton;
    private JLabel adminSelectionLabel;
    private JPanel guestSelectionPanel;
    private JButton playGuestButton;
    private JPanel playPanel;
    private JButton answer1Button;
    private JButton answer2Button;
    private JButton answer3Button;
    private JButton answer4Button;
    private JLabel contentLabel;
    private JButton stopButton;
    private JLabel scoreLabel;
    private JPanel addQuestionPanel;
    private JLabel addQuestionLabel;
    private JTextArea addContentTextArea;
    private JTextField addAnswer1TextField;
    private JTextField addAnswer3TextField;
    private JTextField addAnswer2TextField;
    private JTextField addAnswer4TextField;
    private JButton addQuestionButton;
    private JCheckBox rightAnswer1CheckBox;
    private JCheckBox rightAnswer2CheckBox;
    private JCheckBox rightAnswer3CheckBox;
    private JCheckBox rightAnswer4CheckBox;

    private User user = new User(null, null);
    private String content;
    private String[] answer = new String[4];
    private byte rightAnswer = -1;

    private boolean flagLogin = false;
    private boolean flagGuestSelection = false;
    private boolean flagAnswerSelection = false;
    private boolean flagAdminSelection = false;
    private boolean flagAddQuestion = false;

    private int guestSelection = -1;
    private int answerSelection = -1;
    private int adminSelection = -1;

    public GameIOSwing() {
        super("Ai là triệu phú");
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);

    }
    public User logIn() {
        logInPanel.setVisible(true);

        logInButton.addActionListener(e -> {
            user = new User(usernameTextField.getText(), new String(passwordField.getPassword()));
            flagLogin = true;
        });

        while (!flagLogin) {
            try {
                Thread.sleep(200);
            } catch ( InterruptedException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }

        flagLogin = false;
        return user;
    }

    public void notifyInvalidUser() {
        JOptionPane.showMessageDialog(null, "Wrong username or password");
    }

    public void showGuestMenu() {
        guestSelectionPanel.setVisible(true);
        logInPanel.setVisible(false);
        playPanel.setVisible(false);
    }

    public int getGuestSelection() {

        playGuestButton.addActionListener(e -> {
            guestSelection = 0;
            flagGuestSelection = true;
        });

        while (!flagGuestSelection) {
            try {
                Thread.sleep(200);
            } catch ( InterruptedException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }

        flagGuestSelection = false;
        return guestSelection;
    }

    public void loadQuestion(Question question) {
        playPanel.setVisible(true);
        logInPanel.setVisible(false);
        guestSelectionPanel.setVisible(false);

        String content = question.getContent();
        String[] answer = question.getAnswer();

        contentLabel.setText(content);
        answer1Button.setText("A: " + answer[0]);
        answer2Button.setText("B: " + answer[1]);
        answer3Button.setText("C: " + answer[2]);
        answer4Button.setText("D: " + answer[3]);
    }

    public int getSelection() {
        answer1Button.addActionListener(e -> {
            answerSelection = 0;
            flagAnswerSelection = true;
        });

        answer2Button.addActionListener(e -> {
            answerSelection = 1;
            flagAnswerSelection = true;
        });

        answer3Button.addActionListener(e -> {
            answerSelection = 2;
            flagAnswerSelection = true;
        });

        answer4Button.addActionListener(e -> {
            answerSelection = 3;
            flagAnswerSelection = true;
        });

        stopButton.addActionListener(e -> {
            answerSelection = -1;
            flagAnswerSelection = true;
        });
        while (!flagAnswerSelection) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }

        flagAnswerSelection = false;
        return answerSelection;
    }

    public void showScore(User user) {
        scoreLabel.setText("Điểm: " + user.getScore());
    }
    public void showEndGameMessage(User user) {
        JOptionPane.showMessageDialog(null, "Điểm của ban: " + user.getScore());
    }

    public Question takeNewQuestion() {
        addQuestionPanel.setVisible(true);
        adminSelectionPanel.setVisible(false);

        addContentTextArea.setText(null);
        addAnswer1TextField.setText(null);
        addAnswer2TextField.setText(null);
        addAnswer3TextField.setText(null);
        addAnswer4TextField.setText(null);
        rightAnswer1CheckBox.setSelected(false);
        rightAnswer2CheckBox.setSelected(false);
        rightAnswer3CheckBox.setSelected(false);
        rightAnswer4CheckBox.setSelected(false);

        rightAnswer1CheckBox.addActionListener(e -> rightAnswer = 0);
        rightAnswer2CheckBox.addActionListener(e -> rightAnswer = 1);
        rightAnswer3CheckBox.addActionListener(e -> rightAnswer = 2);
        rightAnswer4CheckBox.addActionListener(e -> rightAnswer = 3);

        addQuestionButton.addActionListener(e -> {
            flagAddQuestion = true;
            content = addContentTextArea.getText();
            answer[0] = addAnswer1TextField.getText();
            answer[1] = addAnswer3TextField.getText();
            answer[2] = addAnswer2TextField.getText();
            answer[3] = addAnswer4TextField.getText();

            if ((!rightAnswer1CheckBox.isSelected() && !rightAnswer2CheckBox.isSelected() && !rightAnswer3CheckBox.isSelected() && !rightAnswer4CheckBox.isSelected()) ||
                    addContentTextArea.getText().equals("") || addAnswer1TextField.getText().equals("") || addAnswer2TextField.getText().equals("") ||
                    addAnswer3TextField.getText().equals("") || addAnswer4TextField.getText().equals("")) {
                flagAddQuestion = false;
                JOptionPane.showMessageDialog(null, "Chưa nhập đầy đủ thông tin câu hỏi");
            }
        });

        while (!flagAddQuestion) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        flagAddQuestion = false;
        JOptionPane.showMessageDialog(null, "Thêm câu hỏi thành công");
        return new Question(content, answer, rightAnswer);
    }

    public void winGame() {
        System.out.println("Ban da thanh trieu phu !!!");
    }

    public void showAdminMenu() {
        playPanel.setVisible(false);
        logInPanel.setVisible(false);
        addQuestionPanel.setVisible(false);
        adminSelectionPanel.setVisible(true);
    }

    public int getAdminSelection() {
        adminPlayButton.addActionListener(e -> {
            adminSelection = 0;
            flagAdminSelection = true;
            adminSelectionPanel.setVisible(false);
            playPanel.setVisible(true);
        });

        addQuestionsButton.addActionListener(e -> {
            adminSelection = 1;
            flagAdminSelection = true;
        });

        while (!flagAdminSelection) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        flagAdminSelection = false;
        return adminSelection;
    }
}
