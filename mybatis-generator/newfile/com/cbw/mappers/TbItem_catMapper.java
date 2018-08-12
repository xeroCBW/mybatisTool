package com.cbw.mappers;

import com.cbw.dto.TbItem_cat;

public interface TbItem_catMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem_cat record);

    int insertSelective(TbItem_cat record);

    TbItem_cat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem_cat record);

    int updateByPrimaryKey(TbItem_cat record);
}