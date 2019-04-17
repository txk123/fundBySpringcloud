package com.txk.springcloudstart.serverfeign.service;

import com.txk.springcloudstart.serverfeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 13:13.
 */
@FeignClient(value = "erueka-client0",fallback = SchedualServiceHiHystric.class)
public interface ServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
