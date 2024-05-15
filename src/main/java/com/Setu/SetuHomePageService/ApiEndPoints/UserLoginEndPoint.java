package com.Setu.SetuHomePageService.ApiEndPoints;

import com.Setu.SetuHomePageService.Authentication.UserLogIn;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLoginEndPoint {

    private final HttpServletResponse httpServletResponse;

    public UserLoginEndPoint(HttpServletResponse httpServletResponse) {
        this.httpServletResponse = httpServletResponse;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/authentication/login")
    public String userLogin(){
        // Todo: - Get the user credentials from the User (username, password)
        System.out .println(httpServletResponse);
        System.out.println("UserLogin Start");
        UserLogIn userLogIn = new UserLogIn();
        System.out.println(userLogIn.ValidateUserCredentials("Saikrishna.dirisala@gmail.com","Saikrishna@221"));
        System.out.println("UserLoginEndPoint end");
        return "True";
    }


}
