package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home/home";
}
    @RequestMapping("/index.html")
    public String index(){

        return "index";
    }

}
