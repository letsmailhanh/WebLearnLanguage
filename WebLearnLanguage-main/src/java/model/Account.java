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
public class Account {
    private int id;
    private String name;
    private String password;
    private int score;
    private int level;

    public Account(String name, String password, int score, int level) {
        this.name = name;
        this.password = password;
        this.score = score;
        this.level = level;
    }


    public Account() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name=" + name + ", password=" + password + ", score=" + score + ", level=" + level + '}';
    }


}
