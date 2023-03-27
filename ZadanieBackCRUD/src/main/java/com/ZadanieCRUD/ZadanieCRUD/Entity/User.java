package com.ZadanieCRUD.ZadanieCRUD.Entity;


import jakarta.persistence.*;
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(name = "user_name", length = 50)
    private String username;
    @Column(name = "user_email", length = 50,unique = true)
    private String useremail;
    @Column(name = "user_password", length = 50)
    private String userpassword;
    @Column(name = "user_birthdate", length = 50)
    private int userbirthdate;
    @Column(name = "user_phone", length = 50)
    private int userphone;

    public User(String username, String useremail, String userpassword, int userbirthdate, int userphone) {
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userbirthdate = userbirthdate;
        this.userphone = userphone;
    }

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUserbirthdate() {
        return userbirthdate;
    }

    public void setUserbirthdate(int userbirthdate) {
        this.userbirthdate = userbirthdate;
    }

    public int getUserphone() {
        return userphone;
    }

    public void setUserphone(int userphone) {
        this.userphone = userphone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userbirthdate=" + userbirthdate +
                ", userphone=" + userphone +
                '}';
    }
}
