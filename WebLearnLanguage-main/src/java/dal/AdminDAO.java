/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Question;
import model.Vocab;

/**
 *
 * @author fsoft
 */
public class AdminDAO extends DBContext {

    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "select * from account";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Account s = new Account();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setPassword(rs.getString("password"));
                s.setScore(rs.getInt("score"));
                s.setLevel(rs.getInt("level"));
                accounts.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accounts;
    }

    public Account getAccount(int id) {
        try {
            String sql = "SELECT * from account where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Account s = new Account();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setPassword(rs.getString("password"));
                s.setScore(rs.getInt("score"));
                s.setLevel(rs.getInt("level"));
                return s;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void insertAccount(Account s) {
        try {
            String sql = "  insert into Account (name, password,score, level) values (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getName());
            statement.setString(2, s.getPassword());
            statement.setString(3, "0");
            statement.setString(4, "0");
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateAccount(Account s) {
        try {
            String sql = "UPDATE [Account]\n"
                    + "   SET [name] = ?\n"
                    + "      ,[password] = ?\n"
                    + "      ,[score] = ?\n"
                    + "      ,[level] = ?\n"
                    + " WHERE [id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getName());
            statement.setString(2, s.getPassword());
            statement.setInt(3, s.getScore());
            statement.setInt(4, s.getLevel());
            statement.setInt(5, s.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAccount(int id) {
        try {
            String sql = "DELETE Account WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateQuestion(Question s) {
        try {
            String sql = "UPDATE [Question]\n"
                    + "   SET [languageCode] = ?\n"
                    + "      ,[lesson] = ?\n"
                    + "      ,[ans1] = ?\n"
                    + "      ,[ans2] = ?\n"
                    + "      ,[ans3] = ?\n"
                    + "      ,[ans4] = ?\n"
                    + "      ,[correct] = ?\n"
                    + " WHERE [id] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, s.getLangCode());
            statement.setString(2, s.getLesson());
            statement.setString(3, s.getAns1());
            statement.setString(4, s.getAns2());
            statement.setString(5, s.getAns3());
            statement.setString(6, s.getAns4());
            statement.setString(7, s.getCorrect());
            statement.setString(8, s.getId());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> qs = new ArrayList<>();
        try {
            String sql = "select * from question";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Question s = new Question();
                s.setId(rs.getString("id"));
                s.setLesson(rs.getString("lesson"));
                s.setLangCode(rs.getString("languageCode"));
                s.setQues(rs.getString("ques"));
                s.setAns1(rs.getString("ans1"));
                s.setAns2(rs.getString("ans2"));
                s.setAns3(rs.getString("ans3"));
                s.setAns4(rs.getString("ans4"));
                s.setCorrect(rs.getString("correct"));
                qs.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qs;
    }
    public Question getQuestion(int id) {
        try {
            String sql = "select * from question where id =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Question s = new Question();
                s.setId(rs.getString("id"));
                s.setLesson(rs.getString("lesson"));
                s.setLangCode(rs.getString("languageCode"));
                s.setQues(rs.getString("ques"));
                s.setAns1(rs.getString("ans1"));
                s.setAns2(rs.getString("ans2"));
                s.setAns3(rs.getString("ans3"));
                s.setAns4(rs.getString("ans4"));
                s.setCorrect(rs.getString("correct"));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void insertQuestion(Question s) {
        try {
            String sql = "  insert into Question (languageCode, lesson, ques, ans1, ans2, ans3, ans4, correct) values (?,?,?,?,?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "ja");
            statement.setString(2, s.getLesson());
            statement.setString(3, s.getQues());
            statement.setString(4, s.getAns1());
            statement.setString(5, s.getAns2());
            statement.setString(6, s.getAns3());
            statement.setString(7, s.getAns4());
            statement.setString(8, s.getCorrect());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteQuestion(int id) {
        try {
            String sql = "DELETE Question WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Vocab> getAllVocabs() {
        ArrayList<Vocab> qs = new ArrayList<>();
        try {
            String sql = "select * from Vocab";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Vocab s = new Vocab();
                s.setId(rs.getString("id"));
                s.setName(rs.getString("name"));
                s.setMeaning(rs.getString("meaning"));
                s.setImage(rs.getString("image"));
                s.setLesson(rs.getString("lesson"));
                s.setLanguageCode(rs.getString("languageCode"));
                qs.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return qs;
    }
    public static void main(String[] args) {
        AdminDAO db = new AdminDAO();
//        ArrayList<Vocab> accounts = db.getAllVocabs();
//        for(Vocab a: accounts){
//            System.out.println(a);
//        }
        Question q = db.getQuestion(3);
        System.out.println(q);
    }
}

