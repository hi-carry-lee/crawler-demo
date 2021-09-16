package com.example.crawler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    /**
     * 文章标题
     */
    @Column(name="headline")
    private String headline;

    /**
     * 文章作者
     */
    @Column(name="author")
    private String author;

    /**
     * 文章发表时间
     */
    @Column(name="date")
    private LocalDateTime date;

    /**
     * 文章摘要
     */
    @Column(name="intro")
    private String intro;

    /**
     * 创建时间
     */
    @Column(name="created")
    private LocalDateTime created;

    /**
     * 修改时间
     */
    @Column(name="updated")
    private LocalDateTime updated;

    /**
     * 文章包含的段落
     */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore // TODO 是否有必要？
    private List<Section> section;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
