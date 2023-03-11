package ru.alisher.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HelloController {
    @GetMapping("hello_world")
    public String sayHello(){
     return "hello_world";
    }

}
