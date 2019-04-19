package com.txk.springcloudstart.serverfeign.service.impl;

import com.txk.springcloudstart.serverfeign.service.InitOptionsService;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/25 18:25. 熔断器fallback调用方法实现
 */
@Component
public class SchedualServiceHiHystric implements InitOptionsService {


    @Override
    public Map<String, String[]> initOptions() {
        return null;
    }
}
