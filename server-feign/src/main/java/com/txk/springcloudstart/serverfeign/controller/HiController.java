package com.txk.springcloudstart.serverfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.txk.springcloudstart.serverfeign.service.ServiceHi;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/25 17:45.
 */
@RestController
public class HiController {

    @Autowired
    private ServiceHi ServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {

        return ServiceHi.sayHiFromClientOne( name );
    }

}
