package com.WebDemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class About {
    @RequestMapping("/about")
    public String about(){

        return  "this is all about Aboutpage";
    }




}
