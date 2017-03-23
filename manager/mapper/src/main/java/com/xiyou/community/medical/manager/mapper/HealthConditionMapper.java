package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import com.xiyou.community.medical.manager.pojo.HealthCondition;
import com.xiyou.community.medical.manager.pojo.HealthConditionExample;

import java.util.List;

public interface HealthConditionMapper {
    int countByExample(HealthConditionExample example);

    int deleteByExample(HealthConditionExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(HealthCondition record);

    int insertSelective(HealthCondition record);

    List<HealthCondition> selectByExample(HealthConditionExample example);

    HealthCondition selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") HealthCondition record, @Param("example") HealthConditionExample example);

    int updateByExample(@Param("record") HealthCondition record, @Param("example") HealthConditionExample example);

    int updateByPrimaryKeySelective(HealthCondition record);

    int updateByPrimaryKey(HealthCondition record);
}