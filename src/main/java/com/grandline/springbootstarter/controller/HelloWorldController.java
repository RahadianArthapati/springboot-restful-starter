package com.grandline.springbootstarter.controller;

import com.grandline.springbootstarter.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by home on 3/26/18.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-bean/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(name);
    }
}
