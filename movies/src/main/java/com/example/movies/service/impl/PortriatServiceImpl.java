package com.example.movies.service.impl;

import com.example.movies.dao.PortraitDao;
import com.example.movies.entity.Movies;
import com.example.movies.entity.Portrait;
import com.example.movies.service.PortraitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortriatServiceImpl implements PortraitService {

    @Autowired
    private PortraitDao portraitDao;

    @Override
    public List<Movies> getMoviesById(Integer id) {
        return portraitDao.selectById(id);
    }
}
