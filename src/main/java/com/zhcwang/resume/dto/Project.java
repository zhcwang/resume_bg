package com.zhcwang.resume.dto;

import java.util.List;

public class Project {
    private int id;

    private String name;

    private String description;

    private String content;

    private List<String> resbonsiblility;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getResbonsiblility() {
        return resbonsiblility;
    }

    public void setResbonsiblility(List<String> resbonsiblility) {
        this.resbonsiblility = resbonsiblility;
    }
}
