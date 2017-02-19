package com.example;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elijahparkhurst on 2/19/17.
 */

@RestController
@RequestMapping("/users")

public class UserController {

    @PostMapping
    public String createUser(){
        return "you posted something";
    }

    @DeleteMapping
    public String deleteUser(){
        return "you deleted something";
    }

}
