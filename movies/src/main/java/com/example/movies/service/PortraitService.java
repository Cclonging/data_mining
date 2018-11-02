package com.example.movies.service;

import com.example.movies.entity.Movies;
import com.example.movies.entity.Portrait;

import java.util.List;

public interface PortraitService {

    List<Movies> getMoviesById(Integer id);
}
