package com.txk.springcloudstart.serverfeign.controller;

import com.txk.springcloudstart.serverfeign.service.FundService;
import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 14:44.
 */
@Controller
public class FundInfoController {
    @Autowired
    FundService fundService;

    @PostMapping(value = "/queryFundInfo")
    @ResponseBody
    public List<FundInfoVo> queryFundInfo(@RequestBody FundInfoVo fundInfoVo) {

        return fundService.queryFundInfo(fundInfoVo);
    }

}
