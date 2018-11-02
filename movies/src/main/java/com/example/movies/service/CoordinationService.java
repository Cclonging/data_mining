package com.example.movies.service;

import com.example.movies.entity.Coordination;

import java.util.List;

public interface CoordinationService {
    List<Coordination> getMoviesById(Integer id);
}
