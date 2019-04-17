package com.txk.springcloudstart.serverfeign.service;

import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;

import java.util.List;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 13:10.
 */
public interface FundService {
    //根据条件查询FundInfo
    List<FundInfoVo> queryFundInfo(FundInfoVo FundInfoVo);
}
