package com.txk.springcloudstart.serverfeign.controller;

import com.txk.springcloudstart.serverfeign.service.FundService;
import com.txk.springcloudstart.serverfeign.service.InitOptionsService;
import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import com.txk.springcloudstart.serverfeign.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 14:44.
 */
@Controller
@Api(tags = "FundInfoController")
public class FundInfoController {
    @Autowired
    FundService fundService;
    @Autowired
    InitOptionsService initOptionsService;

    @ApiOperation(value = "查询fund列表", notes = "根据FundInfoVo查询fund列表")
    @ApiImplicitParam(name = "fundInfoVo", value = "fund实体类",  required = true, dataType = "FundInfoVo")
    @PostMapping(value = "api/queryFundInfo")
    @ResponseBody
    public List<FundInfoVo> queryFundInfo(@RequestBody FundInfoVo fundInfoVo) {

        return fundService.queryFundInfo(fundInfoVo);
    }

    @ApiOperation(value = "初始化下拉列表选项值", notes = "调用其他服务获取下拉选项map")
    @ApiImplicitParam()
    @GetMapping(value = "api/initSelectInfo")
    @ResponseBody
    public Map<String, String[]> initSelectInfo() {
        Map<String, String[]> stringMap =  initOptionsService.initOptions();

        return stringMap;
    }

    @ApiOperation(value = "删除fund", notes = "批量或单个删除fund")
    @ApiImplicitParam(name = "fundInfoVos", value = "fund实体类list",  required = true, dataType = "FundInfoVo")
    @PostMapping(value = "api/removeFunds")
    @ResponseBody
    public ResultVo removeFunds(@RequestBody List<FundInfoVo> fundInfoVos) {
        return fundService.removeFunds(fundInfoVos);
    }

    @ApiOperation(value = "增加fund", notes = "增加fund")
    @ApiImplicitParam(name = "fundInfoVo", value = "fund实体类",  required = true, dataType = "FundInfoVo")
    @PostMapping(value = "api/saveFundInfo")
    @ResponseBody
    public ResultVo  saveFundInfo(@RequestBody FundInfoVo fundInfoVo) {
        return fundService.saveFundInfo(fundInfoVo);
    }

    @ApiOperation(value = "编辑fund", notes = "编辑fund")
    @ApiImplicitParam(name = "fundInfoVo", value = "fund实体类",  required = true, dataType = "FundInfoVo")
    @PostMapping(value = "api/editFundInfo")
    @ResponseBody
    public ResultVo  editFundInfo(@RequestBody FundInfoVo fundInfoVo) {

        return fundService.editFundInfo(fundInfoVo);
    }

}
