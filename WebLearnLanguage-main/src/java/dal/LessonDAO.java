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
import model.Question;
import model.Vocab;

/**
 *
 * @author Hanh
 */
public class LessonDAO extends DBContext {

    public ArrayList<Vocab> getVocabs(String lesson, String code) {
        ArrayList<Vocab> vocabs = new ArrayList<>();
        try {
            String sql = "select * from vocab where lesson = ? and languageCode = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lesson);
            statement.setString(2, code);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Vocab s = new Vocab();
                s.setId(rs.getString("id"));
                s.setName(rs.getString("name"));
                s.setMeaning(rs.getString("meaning"));
                s.setImage(rs.getString("image"));
                s.setLesson(rs.getString("lesson"));
                s.setLanguageCode(rs.getString("languageCode"));
                vocabs.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vocabs;
    }

    public ArrayList<Question> getQuestions(String lesson, String code) {
        ArrayList<Question> qs = new ArrayList<>();
        try {
            String sql = "select * from question where lesson = ? and languageCode = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lesson);
            statement.setString(2, code);
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

    public int countQuestionsInLesson(String lesson, String code) {
        int count = 0;
        try {
            String sql = "  select count(ques) as number from question where lesson =? and languageCode =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lesson);
            statement.setString(2, code);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                count = Integer.parseInt(rs.getString("number"));
                return count;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    public ArrayList<String> getCorrectAnswers(String lesson, String code) {
        ArrayList<String> ans = new ArrayList<>();
        try {
            String sql = "select correct from question where lesson = ? and languageCode = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lesson);
            statement.setString(2, code);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String a = rs.getString("correct");
                ans.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ans;
    }
    public ArrayList<String> getLetters(String lesson) {
        ArrayList<String> ans = new ArrayList<>();
        try {
            String sql = " select image from vocab where lesson = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, lesson);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String a = rs.getString("image");
                ans.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ans;
    }
    public String getAnswerById(String id) {
        
        try {
            String sql = "select correct from question where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String a = rs.getString("correct");
                return a;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        public void updateScore(String name, String score) {
        
        try {
            String sql = " update account set score = ? where name = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, score);
            statement.setString(2, name);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(LessonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public static void main(String[] args) {
        LessonDAO d = new LessonDAO();
        ArrayList<String> a = new ArrayList<>();
        a = d.getLetters("2");
        for (String v: a){
            System.out.println(v);
        }
//        String a = d.getAnswerById("1");
//        System.out.println(a);
    }
}
