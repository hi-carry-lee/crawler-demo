package com.example.crawler.service.impl;

import com.example.crawler.dao.ArticleDao;
import com.example.crawler.entity.Article;
import com.example.crawler.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public void save(Article article) {
        articleDao.save(article);
    }
}
