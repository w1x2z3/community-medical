package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import pojo.PrescribeInput;
import pojo.PrescribeInputExample;

import java.util.List;

public interface PrescribeInputMapper {
    int countByExample(PrescribeInputExample example);

    int deleteByExample(PrescribeInputExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(PrescribeInput record);

    int insertSelective(PrescribeInput record);

    List<PrescribeInput> selectByExample(PrescribeInputExample example);

    PrescribeInput selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") PrescribeInput record, @Param("example") PrescribeInputExample example);

    int updateByExample(@Param("record") PrescribeInput record, @Param("example") PrescribeInputExample example);

    int updateByPrimaryKeySelective(PrescribeInput record);

    int updateByPrimaryKey(PrescribeInput record);
}