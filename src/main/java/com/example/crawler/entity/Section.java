package com.example.crawler.entity;

import javax.persistence.*;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    /**
     * 段落在文章中的的顺序
     */
    @Column(name="seq")
    private int seq;

    /**
     * 段落所属文章id
     */
    @ManyToOne
    @Column(name="article_id")
    private long articleId;

    /**
     * 段落标题
     */
    @Column(name="title")
    private String title;

    /**
     * 段落内容
     */
    @Column(name="content")
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
