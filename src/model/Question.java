package model;

public class Question {

    private int id;
    private String content;
    private String[] answer = new String[4];
    private byte rightAnswer;

    public Question(String content, String[] answer, byte rightAnswer) {
        this.content = content;
        this.answer = answer;
        this.rightAnswer = rightAnswer;
    }

    public Question(int id, String content, String answer0, String answer1, String answer2, String answer3, byte rightAnswer) {
        this.id = id;
        this.content = content;
        answer[0] = answer0;
        answer[1] = answer1;
        answer[2] = answer2;
        answer[3] = answer3;
        this.rightAnswer = rightAnswer;
    }

    public String getContent() {
        return content;
    }

    public String[] getAnswer() {
        return answer;
    }

    public byte getRightAnswer() {
        return rightAnswer;
    }


}
