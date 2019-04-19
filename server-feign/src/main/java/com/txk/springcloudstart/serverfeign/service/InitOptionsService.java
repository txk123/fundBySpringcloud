package com.txk.springcloudstart.serverfeign.service;

import com.txk.springcloudstart.serverfeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Project <fundBySpringcloud>
 * Created by txk on 2019/4/20 3:43.
 */
@FeignClient(value = "erueka-client0",fallback = SchedualServiceHiHystric.class)
public interface InitOptionsService {

    @RequestMapping(value = "/initOptions")
    Map<String, String[]> initOptions();
}
