package com.txk.springcloudstart.serverfeign.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    IFundInfoDao iFundInfoDao;

    @Override
    public List<FundInfoVo> queryFundInfo(FundInfoVo FundInfoVo) {
        PageHelper.startPage(FundInfoVo.getPageNum(),FundInfoVo.getPageSize());
        List<FundInfoVo> fundInfoVos = iFundInfoDao.queryFundInfo(FundInfoVo);
        PageInfo<FundInfoVo> userInfoDtoPageInfo = new PageInfo<FundInfoVo>(fundInfoVos);
        fundInfoVos.get(0).setTotalRecords( userInfoDtoPageInfo.getTotal());
        fundInfoVos.get(0).setPageSize(userInfoDtoPageInfo.getPageSize());
        System.out.println("fundInfoVos = " + fundInfoVos);
        return fundInfoVos;
    }
}
