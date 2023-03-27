package com.ZadanieCRUD.ZadanieCRUD.DTO;

public class UserDTO {

    private int userid;
    private String username;
    private String useremail;
    private int userpassword;
    private String userbirthdate;
    private int userphone;

    public UserDTO(int userid, String username, String useremail, int userpassword, String userbirthdate, int userphone) {
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userbirthdate = userbirthdate;
        this.userphone = userphone;
    }

    public UserDTO() {

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

    public int getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(int userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserbirthdate() {
        return userbirthdate;
    }

    public void setUserbirthdate(String userbirthdate) {
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
