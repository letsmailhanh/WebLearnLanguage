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

/**
 *
 * @author macbookair
 */
public class AccountDAO extends DBContext{
    
    public Account getAccountByUsernameAndPassword(String username,
            String password)
    {    
        try {
            String sql = "SELECT * FROM Account \n"
                    + " WHERE name =? AND password =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                Account a = new Account();
                a.setName(rs.getString("name"));
                a.setPassword(rs.getString("password"));
                return a;
            }else{
                return null;
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
     public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String sql = "select * from account\n" +
                        "order by score desc;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Account s = new Account();
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

    public static void main(String[] args) {
        AccountDAO d = new AccountDAO();
        ArrayList<Account> a = new ArrayList<>();
        a = d.getAllAccounts();
        for (Account v: a){
            System.out.println(v);
        }
    }
}
