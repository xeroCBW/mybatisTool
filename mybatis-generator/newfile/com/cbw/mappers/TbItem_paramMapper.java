package com.cbw.mappers;

import com.cbw.dto.TbItem_param;

public interface TbItem_paramMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem_param record);

    int insertSelective(TbItem_param record);

    TbItem_param selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem_param record);

    int updateByPrimaryKeyWithBLOBs(TbItem_param record);

    int updateByPrimaryKey(TbItem_param record);
}