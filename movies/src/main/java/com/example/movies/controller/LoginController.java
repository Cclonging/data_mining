package com.example.movies.controller;


import com.example.movies.dao.UserDao;
import com.example.movies.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/login")
    public String login(@Param("username") String username, @Param("password") String password, HttpSession session){
        System.out.println(session.getAttribute("username"));
        if (!StringUtils.isEmpty(session.getAttribute("username")))
            return "login";
        if (userService.login(username,password)) {
            session.setAttribute("username", username);
            return "redirect:movies";
        }
        return "login";
    }

    @RequestMapping("/to_login")
    public String to_login(){
        return "login";
    }

    @RequestMapping("/movies")
    public String refresh(){return "movies";}

    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.removeAttribute("username");
        return "login";
    }

    @RequestMapping("/insert")
    public void insert(){
        for (int i = 3; i <= 138494; i++)
            userService.insert(i);
    }

    @RequestMapping("/removeAll")
    public String removeAll(HttpSession session){
        session.removeAttribute("username");
        return "login";
    }
}
