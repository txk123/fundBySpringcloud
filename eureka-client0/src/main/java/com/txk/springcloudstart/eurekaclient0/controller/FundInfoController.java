package com.txk.springcloudstart.eurekaclient0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Project <fundBySpringcloud>
 * Created by txk on 2019/4/20 3:46.
 */
@Controller
public class FundInfoController {

    @RequestMapping(value = "/initOptions")
    @ResponseBody
    Map<String, String[]> initOptions() {
        Map<String, String[]> optionsHashMap = new HashMap<>();
        String[] custodianCodes = {"1", "2"};
        String[] taCodes = {"1", "2"};
        String[] fundCategories = {"1", "2"};
        String[] needReviews = {"1", "2"};
        optionsHashMap.put("custodianCodes", custodianCodes);
        optionsHashMap.put("taCodes", taCodes);
        optionsHashMap.put("fundCategories", fundCategories);
        optionsHashMap.put("needReviews", needReviews);
        return optionsHashMap;
    }
}
