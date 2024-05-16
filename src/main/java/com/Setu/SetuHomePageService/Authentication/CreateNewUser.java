package com.Setu.SetuHomePageService.Authentication;

import java.util.HashMap;

public class CreateNewUser {

    /**
     * Function to take the input data from the creation new user application endpoint.
     */
      public boolean GetNewUserData(HashMap<String, String> newUserData) {
        if (ValidateEmail() &&
                ValidateFullName(newUserData.get("FullName")) &&
                ValidateNumber(newUserData.get("Number")) &&
                ValidatePassword(newUserData.get("password"))){
            return true;
        }
        return true;
    }

    /**
     * Function to valid the length of the password.
     */
    private boolean ValidatePassword(String password) {
        // Todo:- Modify the code as per the conditions.
        return 6 <= password.length() && password.length() <= 15;
    }

    /**
     * Function to verify the input string is mobile number.
     */
    private boolean ValidateNumber(String number) {
        // Todo:- Implement the java code to verify the input string is valid phone number.
        return false;
    }

    /**
     * Function to verify Full Name.
     */
    private boolean ValidateFullName(String fullName) {
        // Todo:- Implement the java code to verify the input string is valid full name.
        return false;
    }

    /**
     * Function to validate the email address.
     */
    private boolean ValidateEmail() {
        // Todo:- Implement the java code to verify the input string is the email address
        return true;
    }
}
