package com.example.movies.service;

import com.example.movies.entity.Content;

import java.util.List;

public interface ContentService {
    List<Content> getMoviesById(Integer id);
}
