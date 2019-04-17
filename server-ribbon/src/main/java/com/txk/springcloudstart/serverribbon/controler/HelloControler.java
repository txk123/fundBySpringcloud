package com.txk.springcloudstart.serverribbon.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.txk.springcloudstart.serverribbon.service.HelloService;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/25 2:35.
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;


    @RequestMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "txk") String name){
        System.out.println("name = [" + name + "]");
        return helloService.hiService(name);
    }

}
