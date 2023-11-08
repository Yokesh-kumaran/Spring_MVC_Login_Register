package com.springmvc.controller;

import com.springmvc.dao.HomeDao;
import com.springmvc.db.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    private final HomeDao homeDao;

    @Autowired
    public HomeController(HomeDao homeDao) {
        this.homeDao = homeDao;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return "login";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String viewUsers(Model model) {
        List<Map<String, Object>> userDataList = homeDao.getUserDataList();
        model.addAttribute("userDataList", userDataList);
        return "home";
    }
}
