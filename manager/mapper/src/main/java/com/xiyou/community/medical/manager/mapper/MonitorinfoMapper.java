package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import com.xiyou.community.medical.manager.pojo.Monitorinfo;
import com.xiyou.community.medical.manager.pojo.MonitorinfoExample;

import java.util.List;

public interface MonitorinfoMapper {
    int countByExample(MonitorinfoExample example);

    int deleteByExample(MonitorinfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(Monitorinfo record);

    int insertSelective(Monitorinfo record);

    List<Monitorinfo> selectByExample(MonitorinfoExample example);

    Monitorinfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") Monitorinfo record, @Param("example") MonitorinfoExample example);

    int updateByExample(@Param("record") Monitorinfo record, @Param("example") MonitorinfoExample example);

    int updateByPrimaryKeySelective(Monitorinfo record);

    int updateByPrimaryKey(Monitorinfo record);
}