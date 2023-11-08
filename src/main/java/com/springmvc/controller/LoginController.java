package com.springmvc.controller;

import com.springmvc.dao.LoginDao;
import com.springmvc.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoginDao loginDao;
    @Autowired
    public LoginController(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginForm() {
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginProcess(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        if (loginDao.isValidUser(email, password)) {
            return "redirect:/home";
        } else {
            model.addAttribute("errormessage", "Invalid Credentials");
            return "index";
        }
    }
}
