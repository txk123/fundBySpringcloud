package com.txk.springcloudstart.serverfeign.service.impl;

import com.txk.springcloudstart.serverfeign.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * Project <springcloudstart>
 * Created by txk on 2019/3/25 18:25. 熔断器fallback调用方法实现
 */
@Component
public class SchedualServiceHiHystric  implements ServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry feignHystric";
    }
}
