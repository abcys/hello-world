package com.dj.taotao.mapper;

import com.dj.taotao.pojo.TbOrderItem;
import com.dj.taotao.pojo.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    long countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);
}