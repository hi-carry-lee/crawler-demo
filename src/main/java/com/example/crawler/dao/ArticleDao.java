package com.example.crawler.dao;

import com.example.crawler.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleDao extends JpaRepository<Article, Long> {

}
