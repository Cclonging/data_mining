package com.example.movies.service.impl;

import com.example.movies.dao.ContentDao;
import com.example.movies.entity.Content;
import com.example.movies.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentDao contentDao;

    @Override
    public List<Content> getMoviesById(Integer id) {
        return contentDao.selectById(id);
    }
}
