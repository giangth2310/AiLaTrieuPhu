package model;

import java.io.*;
import java.sql.*;
import java.util.*;

public class Database {

    private ArrayList<Question> questionList = new ArrayList<Question>();
    private String dbUser;
    private String dbUrl;
    private String dbPassword;
    private Connection connection;
    private Statement statement;
    private static int currentQuestion = -1;

    public Database() {
        createConnection();
        createStatement();
        getAllQuestion();
    }

    private void createConnection() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("database.properties"));
            dbUrl = properties.getProperty("url");
            dbUser = properties.getProperty("user");
            dbPassword = properties.getProperty("password");
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createStatement() {
        if (statement == null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ResultSet getData(String sqlCommand) {
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(sqlCommand);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public User checkUser(User user) {

        ResultSet resultSet = getData("select * from user where userName = '" + user.getUserName() + "'");

        try {
            if (resultSet.next()) {
                if (user.getUserName().equals("admin")) {
                    if (resultSet.getString(3).equals(user.getPassword())) {
                        user.setRole(Role.ADMIN);
                    }
                } else {
                    if (resultSet.getString(3).equals(user.getPassword())) {
                        user.setRole(Role.GUEST);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    private void getAllQuestion() {
        ResultSet resultSet = getData("select * from question");

        try {
            while (resultSet.next()) {
                questionList.add(new Question(resultSet.getInt(1), resultSet.getString(2),
                                    resultSet.getString(3), resultSet.getString(4),
                                    resultSet.getString(5), resultSet.getString(6),
                                    resultSet.getByte(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Collections.shuffle(questionList);
    }

    public Question getNextQuestion() {
        currentQuestion += 1;
        try {
            return questionList.get(currentQuestion);
        } catch (Exception e) {
            return null;
        }
    }

    private int executeUpdate(String sdlCommand, int[] index, String[] value) {
        int rowAffected = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sdlCommand);
            for (int i = 0; i < index.length; i++) {
                preparedStatement.setString(index[i], value[i]);
            }
            rowAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowAffected;
    }

    public void addQuestion(Question question) {
        String sdlCommand = "insert into question(answer0,answer1,answer2,answer3,content,rightAnswer) values(?,?,?,?,?,?)";
        int[] index = {1, 2, 3, 4, 5, 6};
        String[] answer = question.getAnswer();
        Number rightAnswer = question.getRightAnswer();
        String[] value = {answer[0], answer[1], answer[2], answer[3], question.getContent(), rightAnswer.toString()};

        executeUpdate(sdlCommand, index, value);
    }
}
