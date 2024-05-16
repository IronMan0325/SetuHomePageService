package com.Setu.SetuHomePageService.ApiEndPoints;

import com.Setu.SetuHomePageService.Authentication.CreateNewUser;

import java.util.HashMap;

public class CreateNewUserEndPoint {

    /**
     * This function create the application call to create the new user.
     * Input Request: - It has the data. Need to verify the data.
     * Return Response: - Returns the response with the status code.
     */
    public String CreateNewUser(){
        HashMap<String, String> exampleData = new HashMap<String, String>() {{
            put("FullName", "Saikrishna Dirisala");
            put("Email", "saikrishna.dirisala@gmail.com");
            put("Number", "7163038479");
            put("Password", "Saikrishna@221");
        }};
        // This return statement is for the testing purpose. In future need to modify the return statement.
        return "True";
    }

}
