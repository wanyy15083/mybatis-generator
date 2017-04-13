package com.frotly.mybatis.dao;

import com.frotly.mybatis.model.PushSku;
import org.apache.ibatis.annotations.Param;

public interface PushSkuMapper {
    int deleteByPrimaryKey(@Param("sysCode") String sysCode, @Param("skuId") Integer skuId);

    int insert(PushSku record);

    int insertSelective(PushSku record);

    PushSku selectByPrimaryKey(@Param("sysCode") String sysCode, @Param("skuId") Integer skuId);

    int updateByPrimaryKeySelective(PushSku record);

    int updateByPrimaryKey(PushSku record);
}