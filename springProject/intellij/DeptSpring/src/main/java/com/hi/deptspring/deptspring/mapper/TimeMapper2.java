package com.hi.deptspring.deptspring.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper2 {

    @Select("select now()")
    String getTime();

}
