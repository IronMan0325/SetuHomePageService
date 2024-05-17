package com.Setu.SetuHomePageService.Authentication;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreateNewUser {

    /**
     * Function to take the input data from the creation new user application endpoint.
     */
      public boolean GetNewUserData(HashMap<String, String> newUserData) {
        if (ValidateEmail("Email") &&
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
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$") && password.length() >= 6 && password.length() <= 16;
    }

    /**
     * Function to verify the input string is mobile number.
     */
    private boolean ValidateNumber(String number) {
        return number.matches("^(?:\\(?([0-9]{3})\\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})(?: x(\\d+))?)$");
    }

    /**
     * Function to verify Full Name.
     */
    private boolean ValidateFullName(String fullName) {
        return fullName.matches("^[a-zA-Z]+(?: [a-zA-Z]+)*([ \\-'][a-zA-Z]+)*$");
    }

    /**
     * Function to validate the email address.
     */
    private boolean ValidateEmail(String Email) {
        return Email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    }
}
