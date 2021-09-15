package com.example.crawler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
    @Column(name="title")
    private String title;

    /**
     * 文章作者
     */
    @Column(name="author")
    private float author;

    /**
     * 文章发表时间
     */
    @Column(name="post_date")
    private String postDate;

    /**
     * 文章内容
     */
    @Column(name="content")
    private String content;

    /**
     * 创建时间
     */
    @Column(name="created")
    private Date created;

    /**
     * 修改时间
     */
    @Column(name="updated")
    private Date updated;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getAuthor() {
        return author;
    }

    public void setAuthor(float author) {
        this.author = author;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
