package com.txk.springcloudstart.serverfeign.service.impl;

import com.txk.springcloudstart.serverfeign.dao.IFundInfoDao;
import com.txk.springcloudstart.serverfeign.service.FundService;
import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 13:47.
 */
@Service
public class FundServiceImpl implements FundService {
    @Autowired
    IFundInfoDao IFundInfoDao;

    @Override
    public List<FundInfoVo> queryFundInfo(FundInfoVo FundInfoVo) {

        return IFundInfoDao.queryFundInfo(FundInfoVo);
    }
}
