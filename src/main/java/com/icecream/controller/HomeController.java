package com.icecream.controller;

import com.icecream.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by vlrkw on 2017-03-19.
 */
@Controller
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/")
    public String index() throws Exception{
        return "index";
    }

    @RequestMapping("/home")
    public String getHome(Model model,@RequestParam String name) throws Exception{
        model.addAttribute("home", homeService.select(name));
        return "home";
    }
}
