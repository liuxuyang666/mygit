package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class NewsBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String title;
    private String boby;
    private Integer type;
    private Date NewTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBoby() {
        return boby;
    }

    public void setBoby(String boby) {
        this.boby = boby;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getNewTime() {
        return NewTime;
    }

    public void setNewTime(Date newTime) {
        NewTime = newTime;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", boby='" + boby + '\'' +
                ", type=" + type +
                ", NewTime=" + NewTime +
                '}';
    }
}
