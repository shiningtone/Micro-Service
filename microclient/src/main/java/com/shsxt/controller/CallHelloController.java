package com.shsxt.controller;

import com.shsxt.service.CallHelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * Created by administer on 2017/10/12.
 */
@RestController
public class CallHelloController {
    @Resource
    private CallHelloService callHelloService;

    @RequestMapping("hello")
    public String hello(String name)
    {
        String result =callHelloService.callHello(name);
        return  result;
    }
}
