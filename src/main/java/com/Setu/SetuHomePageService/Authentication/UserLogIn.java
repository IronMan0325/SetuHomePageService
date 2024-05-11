package com.Setu.SetuHomePageService.Authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogIn {
    // Todo: - Get the user details from the function
    public boolean ValidateUserCredentials(String username, String password){
        return _ValidateUserCredentials(username, password);
    }

    private boolean ValidateUserName(String username){
        // Todo: - Check the username is in the proper format.
        String emailFormat = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailFormat);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    // Todo: - If there is user, then return true for the client.
    private boolean _ValidateUserCredentials(String username, String password){
        if (ValidateUserName(username)){
            return _ValidateUserCredentials(username, password);
        }
        return false;
    }
}
