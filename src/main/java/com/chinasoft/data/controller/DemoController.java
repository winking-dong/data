package com.chinasoft.data.controller;


import com.chinasoft.data.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("demoController")
public class DemoController {
    @Autowired
    private DemoService demoService;
    public  void demo(){
        demoService.say();
    }
}
