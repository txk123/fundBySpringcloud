package com.txk.springcloudstart.serverfeign.dao;

import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 14:25.
 */
@Mapper
public interface IFundInfoDao {
    List<FundInfoVo> queryFundInfo(FundInfoVo FundInfoVo);
}
