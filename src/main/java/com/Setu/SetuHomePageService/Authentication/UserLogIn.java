package com.Setu.SetuHomePageService.Authentication;

public class UserLogIn {
    // Todo: - Get the user details from the function
    public boolean ValidateUserCredentials(String username, String password){
        return _ValidateUserCredentials(username, password);
    }

    private boolean ValidateUserName(String username){
        // Todo: - Check the username is in the proper format.
        return false;
    }

    // Todo: - If there is user, then return true for the client.
    private boolean _ValidateUserCredentials(String username, String password){
        if (ValidateUserName(username)){
            return _ValidateUserCredentials(username, password);
        }
        return false;
    }
}
