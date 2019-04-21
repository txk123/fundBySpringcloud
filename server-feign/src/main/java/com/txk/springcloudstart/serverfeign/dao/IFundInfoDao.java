package com.txk.springcloudstart.serverfeign.dao;

import com.txk.springcloudstart.serverfeign.vo.FundInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Project <springcloudstart>
 * Created by zkq on 2019/4/17 14:25.
 */
@Mapper
@Repository
public interface IFundInfoDao {
    List<FundInfoVo> queryFundInfo(FundInfoVo FundInfoVo);

    int removeFunds(List<FundInfoVo> fundInfoVos);

    int saveFundInfo(FundInfoVo fundInfoVo);

    int editFundInfo(FundInfoVo fundInfoVo);
}
