package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import com.xiyou.community.medical.manager.pojo.Lifestyle;
import com.xiyou.community.medical.manager.pojo.LifestyleExample;

import java.util.List;

public interface LifestyleMapper {
    int countByExample(LifestyleExample example);

    int deleteByExample(LifestyleExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Lifestyle record);

    int insertSelective(Lifestyle record);

    List<Lifestyle> selectByExample(LifestyleExample example);

    Lifestyle selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Lifestyle record, @Param("example") LifestyleExample example);

    int updateByExample(@Param("record") Lifestyle record, @Param("example") LifestyleExample example);

    int updateByPrimaryKeySelective(Lifestyle record);

    int updateByPrimaryKey(Lifestyle record);
}