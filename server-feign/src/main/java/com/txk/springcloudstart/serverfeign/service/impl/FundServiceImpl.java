package com.txk.springcloudstart.serverfeign.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.txk.springcloudstart.serverfeign.dao.IFundInfoDao;
import com.txk.springcloudstart.serverfeign.service.FundService;
import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import com.txk.springcloudstart.serverfeign.vo.ResultVo;
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
        if ((null==fundInfoVos || fundInfoVos.isEmpty())) {
            return fundInfoVos;
        }
        fundInfoVos.get(0).setTotalRecords( userInfoDtoPageInfo.getTotal());
        fundInfoVos.get(0).setPageSize(userInfoDtoPageInfo.getPageSize());
        return fundInfoVos;
    }

    @Override
    public ResultVo removeFunds(List<FundInfoVo> fundInfoVos) {
        ResultVo resultVo = new ResultVo();
        int i=iFundInfoDao.removeFunds(fundInfoVos);
        if (i>0) {
            resultVo.setResCode("0");
        }
        return resultVo;
    }

    @Override
    public ResultVo saveFundInfo(FundInfoVo fundInfoVo) {
        ResultVo resultVo = new ResultVo();
        int i=iFundInfoDao.saveFundInfo(fundInfoVo);
        if (i>0) {
            resultVo.setResCode("0");
        }
        return resultVo;
    }

    @Override
    public ResultVo editFundInfo(FundInfoVo fundInfoVo) {
        ResultVo resultVo = new ResultVo();
        int i=iFundInfoDao.editFundInfo(fundInfoVo);
        if (i>0) {
            resultVo.setResCode("0");
        }
        return resultVo;
    }
}
