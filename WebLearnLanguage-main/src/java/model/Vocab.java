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
public class Vocab {
    private String id;
    private String name;
    private String meaning;
    private String image;
    private String lesson;
    private String languageCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Vocab(String id, String name, String meaning, String image, String lesson, String languageCode) {
        this.id = id;
        this.name = name;
        this.meaning = meaning;
        this.image = image;
        this.lesson = lesson;
        this.languageCode = languageCode;
    }

    public Vocab() {
    }

    @Override
    public String toString() {
        return "Vocab{" + "id=" + id + ", name=" + name + ", meaning=" + meaning + ", image=" + image + ", lesson=" + lesson + ", languageCode=" + languageCode + '}';
    }
    
}
