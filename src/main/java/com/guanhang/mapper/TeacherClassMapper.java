package com.guanhang.mapper;

import com.guanhang.bean.TeacherClass;
import com.guanhang.bean.TeacherClassExample;
import com.guanhang.bean.TeacherClassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherClassMapper {
    int countByExample(TeacherClassExample example);

    int deleteByExample(TeacherClassExample example);

    int deleteByPrimaryKey(TeacherClassKey key);

    int insert(TeacherClass record);

    int insertSelective(TeacherClass record);

    List<TeacherClass> selectByExample(TeacherClassExample example);

    TeacherClass selectByPrimaryKey(TeacherClassKey key);

    int updateByExampleSelective(@Param("record") TeacherClass record, @Param("example") TeacherClassExample example);

    int updateByExample(@Param("record") TeacherClass record, @Param("example") TeacherClassExample example);

    int updateByPrimaryKeySelective(TeacherClass record);

    int updateByPrimaryKey(TeacherClass record);
}