package com.Setu.SetuHomePageService.Authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogIn {

    /**
     * Function to validate the input user credentials form the user.
     */
    public boolean ValidateUserCredentials(String username, String password){
        try{
            return _ValidateUserCredentials(username, password);
        } catch (Exception e){
            return e.getMessage().equals("Username or Password is incorrect");
        }

    }

    /**
     * Function to check the email is in the correct format.
     */
    private boolean ValidateUserName(String username){
        // Checking the username is in the proper format.
        String emailFormat = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailFormat);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    /**
     * Function to check the length of the string.
     */
    private boolean ValidatePassword(String password){
        return 6 <= password.length() && password.length() <= 15;
    }

    /**
     * Function to check the username and password as the valid ones.
     */
    private boolean _ValidateUserCredentials(String username, String password){
        if (ValidateUserName(username) && ValidatePassword(password)){
            // Todo: - Call to the database function where we can verify the user credentials.
            return true;
        }
        return false;
    }
}