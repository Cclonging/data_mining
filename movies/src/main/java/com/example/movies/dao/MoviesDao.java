package com.example.movies.dao;

import com.example.movies.entity.Movies;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MoviesDao {

    @Select("select n.title,n.genres.n.year,n.rating from new_movies where movieId = #{movieId}")
    List<Movies> selectMovieById(Integer movieId);
}
