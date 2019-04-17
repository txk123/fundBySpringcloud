package com.txk.springcloudstart.serverribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/25 2:34.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//断路器回调方法
    public String hiService(String name) {
        return restTemplate.getForObject("http://erueka-client0/hi?name="+name,String.class);
    }

    public String hiError(String name ){
        return "hi,"+name+",sorry,error!";
    }

}
