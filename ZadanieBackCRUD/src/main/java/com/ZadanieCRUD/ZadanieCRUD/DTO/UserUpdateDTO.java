package com.ZadanieCRUD.ZadanieCRUD.DTO;

public class UserUpdateDTO {
    private int userid;
    private String username;
    private String useremail;
    private String userpassword;
    private int userbirthdate;
    private int userphone;

    public UserUpdateDTO(int userid, String username, String useremail, String userpassword, int userbirthdate, int userphone) {
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userbirthdate = userbirthdate;
        this.userphone = userphone;
    }

    public UserUpdateDTO() {

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
        return "UserDTO{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userbirthdate=" + userbirthdate +
                ", userphone=" + userphone +
                '}';
    }
}
