package com.shsxt.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by administer on 2017/10/12.
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return name + "say hello";
    }
}