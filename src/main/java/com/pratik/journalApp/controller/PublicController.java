package com.pratik.journalApp.controller;

import com.pratik.journalApp.entities.User;
import com.pratik.journalApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {


    @Autowired
    private UserService userService;

    @PostMapping("create-user")
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
