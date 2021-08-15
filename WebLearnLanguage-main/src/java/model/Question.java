/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hanh
 */
public class Question {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String langCode;
    private String lesson;
    private String ques;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;    
    private String correct;

    public Question() {
    }

    public Question(String langCode, String lesson, String ques, String ans1, String ans2, String ans3, String ans4, String correct) {
        this.langCode = langCode;
        this.lesson = lesson;
        this.ques = ques;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correct = correct;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Question{" + "langCode=" + langCode + ", lesson=" + lesson + ", ques=" + ques + ", ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3 + ", ans4=" + ans4 + ", correct=" + correct + '}';
    }
    
    
}
