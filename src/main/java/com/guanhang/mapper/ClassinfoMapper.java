package com.guanhang.mapper;

import com.guanhang.bean.Classinfo;
import com.guanhang.bean.ClassinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassinfoMapper {
    int countByExample(ClassinfoExample example);

    int deleteByExample(ClassinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Classinfo record);

    int insertSelective(Classinfo record);

    List<Classinfo> selectByExample(ClassinfoExample example);

    Classinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Classinfo record, @Param("example") ClassinfoExample example);

    int updateByExample(@Param("record") Classinfo record, @Param("example") ClassinfoExample example);

    int updateByPrimaryKeySelective(Classinfo record);

    int updateByPrimaryKey(Classinfo record);
}