package com.shsxt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by administer on 2017/10/12.
 */
@Service
public class CallHelloService {


    public String appServiceUrl="http://MICRO-SERVICE/";

   @Autowired
    protected  RestTemplate RestTemplate;


    public String callHello(String name)
    {
        String url=appServiceUrl+"hello/"+name;
        ResponseEntity<String> result=RestTemplate.postForEntity(appServiceUrl + "hello/" + name, null, String.class);
        return result.getBody();
    }

}
