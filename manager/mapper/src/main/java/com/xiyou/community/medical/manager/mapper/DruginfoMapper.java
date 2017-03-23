package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Druginfo;
import pojo.DruginfoExample;

import java.util.List;

public interface DruginfoMapper {
    int countByExample(DruginfoExample example);

    int deleteByExample(DruginfoExample example);

    int deleteByPrimaryKey(String drugNumber);

    int insert(Druginfo record);

    int insertSelective(Druginfo record);

    List<Druginfo> selectByExample(DruginfoExample example);

    Druginfo selectByPrimaryKey(String drugNumber);

    int updateByExampleSelective(@Param("record") Druginfo record, @Param("example") DruginfoExample example);

    int updateByExample(@Param("record") Druginfo record, @Param("example") DruginfoExample example);

    int updateByPrimaryKeySelective(Druginfo record);

    int updateByPrimaryKey(Druginfo record);
}