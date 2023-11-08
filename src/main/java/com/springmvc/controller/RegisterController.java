package com.springmvc.controller;

import com.springmvc.dao.RegisterDao;
import com.springmvc.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {
    private final RegisterDao registerDao;

    @Autowired
    public RegisterController(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegisterForm() {
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUsers(@RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("c_password") String c_password, Model model) {
        if (password.equals(c_password)) {
            if (registerDao.registerUser(email, name, password)) {
                model.addAttribute("registeredmessage", "Registration successful. You can login now.");
                return "index";
            } else {
                model.addAttribute("errormessage", "Registration failed. Please try again.");
                return "register";
            }
        } else {
            model.addAttribute("errormessage", "Password does not match!");
            return "register";
        }
    }
}
