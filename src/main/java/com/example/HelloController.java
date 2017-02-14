package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

  @GetMapping("/")
  public String helloWorld(){
    return "Hello from Spring";
  }

}