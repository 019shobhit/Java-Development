package com.shobhit.MyFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("abc")
    public String sayHello(){
        return "hello this is my first webpage using java";
    }
}
