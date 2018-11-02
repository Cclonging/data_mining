package com.example.movies.dao;

import com.example.movies.entity.Coordination;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CoordinationDao {
    @Select(value = "select num,name,category,time,score,userid from coordination where userid = #{id}")
    List<Coordination> selectById(Integer id);
}
