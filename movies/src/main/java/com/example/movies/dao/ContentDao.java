package com.example.movies.dao;

import com.example.movies.entity.Content;
import com.example.movies.entity.Portrait;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ContentDao {
    @Select(value = "select num,name,category,time,score,userid from content where userid = #{id}")
    List<Content> selectById(Integer id);
}
