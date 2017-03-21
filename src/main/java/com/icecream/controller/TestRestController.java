package com.icecream.controller;

import com.icecream.model.Home;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vlrkw on 2017-03-21.
 */
@RestController
public class TestRestController
{
    @PostMapping("/homeRest")
    public Home restHome(){
        Home home = new Home();
        home.setName("test");
        home.setAge("20");
        home.setMessage("test");
        return home;
    }
}
