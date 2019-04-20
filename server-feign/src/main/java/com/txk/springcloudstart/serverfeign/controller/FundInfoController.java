package com.txk.springcloudstart.serverfeign.controller;

import com.txk.springcloudstart.serverfeign.service.FundService;
import com.txk.springcloudstart.serverfeign.service.InitOptionsService;
import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import com.txk.springcloudstart.serverfeign.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 14:44.
 */
@Controller
public class FundInfoController {
    @Autowired
    FundService fundService;
    @Autowired
    InitOptionsService initOptionsService;

    @PostMapping(value = "api/queryFundInfo")
    @ResponseBody
    public List<FundInfoVo> queryFundInfo(@RequestBody FundInfoVo fundInfoVo) {

        return fundService.queryFundInfo(fundInfoVo);
    }

    @RequestMapping(value = "api/initSelectInfo")
    @ResponseBody
    public Map<String, String[]> initSelectInfo() {
        Map<String, String[]> stringMap =  initOptionsService.initOptions();

        return stringMap;
    }

    @RequestMapping(value = "api/removeFunds")
    @ResponseBody
    public ResultVo removeFunds(@RequestBody List<FundInfoVo> fundInfoVos) {
        return fundService.removeFunds(fundInfoVos);
    }
}
