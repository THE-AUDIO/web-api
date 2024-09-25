package com.api.web_api.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControler {


    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    @GetMapping("/req/signup")
    public String signupPage(){
       return "signup";
    }
}
