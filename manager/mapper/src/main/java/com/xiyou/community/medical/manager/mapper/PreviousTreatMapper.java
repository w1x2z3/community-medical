package com.xiyou.community.medical.manager.mapper;

import org.apache.ibatis.annotations.Param;
import com.xiyou.community.medical.manager.pojo.PreviousTreat;
import com.xiyou.community.medical.manager.pojo.PreviousTreatExample;

import java.util.List;

public interface PreviousTreatMapper {
    int countByExample(PreviousTreatExample example);

    int deleteByExample(PreviousTreatExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(PreviousTreat record);

    int insertSelective(PreviousTreat record);

    List<PreviousTreat> selectByExample(PreviousTreatExample example);

    PreviousTreat selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") PreviousTreat record, @Param("example") PreviousTreatExample example);

    int updateByExample(@Param("record") PreviousTreat record, @Param("example") PreviousTreatExample example);

    int updateByPrimaryKeySelective(PreviousTreat record);

    int updateByPrimaryKey(PreviousTreat record);
}