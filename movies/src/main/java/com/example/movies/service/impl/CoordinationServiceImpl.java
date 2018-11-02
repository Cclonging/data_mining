package com.example.movies.service.impl;

import com.example.movies.dao.CoordinationDao;
import com.example.movies.entity.Coordination;
import com.example.movies.service.CoordinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinationServiceImpl implements CoordinationService {
    @Autowired
    private CoordinationDao coordinationDao;

    @Override
    public List<Coordination> getMoviesById(Integer id) {
        return coordinationDao.selectById(id);
    }
}
