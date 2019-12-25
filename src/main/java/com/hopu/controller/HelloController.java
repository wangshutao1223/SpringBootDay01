package com.hopu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
@RequestMapping("say")
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("hello")
    @ResponseBody
    public  String sayHi(){

        System.out.println(dataSource);
        return  "hello Spring  Boot";
    }
}
