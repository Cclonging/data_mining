package com.example.movies.dao;


import com.example.movies.entity.Movies;
import com.example.movies.entity.Portrait;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface PortraitDao {

    @Results({
            @Result(property="mo",column="mo"),
            @Result(property="movieId",column="movieId", one=@One(select="com.example.movies.dao.MoviesDao.selectMovieById",fetchType=FetchType.LAZY))
    })
    @Select(value = "select n.title,n.genres,n.year,n.rating from portrait p left join new_movies n on p.mo = n.mo where p.userid = #{userid}")
    List<Movies> selectById(Integer userid);
}
