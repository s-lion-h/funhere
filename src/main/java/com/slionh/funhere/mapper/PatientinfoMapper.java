package com.slionh.funhere.mapper;

import com.slionh.funhere.entity.Patientinfo;
import com.slionh.funhere.entity.PatientinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientinfoMapper {
    int countByExample(PatientinfoExample example);

    int deleteByExample(PatientinfoExample example);

    int deleteByPrimaryKey(String cardno);

    int insert(Patientinfo record);

    int insertSelective(Patientinfo record);

    List<Patientinfo> selectByExample(PatientinfoExample example);

    Patientinfo selectByPrimaryKey(String cardno);

    int updateByExampleSelective(@Param("record") Patientinfo record, @Param("example") PatientinfoExample example);

    int updateByExample(@Param("record") Patientinfo record, @Param("example") PatientinfoExample example);

    int updateByPrimaryKeySelective(Patientinfo record);

    int updateByPrimaryKey(Patientinfo record);
}