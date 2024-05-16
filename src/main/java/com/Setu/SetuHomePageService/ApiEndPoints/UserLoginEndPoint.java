package com.Setu.SetuHomePageService.ApiEndPoints;

import com.Setu.SetuHomePageService.Authentication.UserLogIn;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class UserLoginEndPoint {

    private final HttpServletResponse httpServletResponse;

    public UserLoginEndPoint(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    private RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.POST, path = "/authentication/login")
    public String UserLogin(){
        // Todo: - Get the user credentials from the User (username, password)
        System.out .println(httpServletResponse); // Remove the print statement.
        System.out.println("UserLogin Start"); // Remove the print statement.
        UserLogIn userLogIn = new UserLogIn();
        System.out.println(userLogIn.ValidateUserCredentials("Saikrishna.dirisala@gmail.com","Saikrishna@221"));
        System.out.println("UserLoginEndPoint end"); // Remove the print statement.
        return "True";
    }
}
