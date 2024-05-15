package com.Setu.SetuHomePageService.Utils;

public class NewUserSetu implements NewUser{
    /**
     * NewUserSetu variables.
     */
    private final String fullName;
    private final String email;
    private final String mobileNumber;
    private final String password;
    public NewUserSetu(String fullName, String email, String mobileNumber, String password) {
       this.fullName = fullName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }
    /**
     * Getter functions of the variables.
     */
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public String getPassword() {
        return password;
    }
}
