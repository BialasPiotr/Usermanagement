package com.ZadanieCRUD.ZadanieCRUD.DTO;

public class UserSaveDTO {
    private String username;
    private String useremail;
    private String userpassword;
    private int userbirthdate;
    private int userphone;

    public UserSaveDTO( String username, String useremail, String userpassword, int userbirthdate, int userphone) {
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userbirthdate = userbirthdate;
        this.userphone = userphone;
    }

    public UserSaveDTO() {

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
                ", username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userbirthdate=" + userbirthdate +
                ", userphone=" + userphone +
                '}';
    }
}
