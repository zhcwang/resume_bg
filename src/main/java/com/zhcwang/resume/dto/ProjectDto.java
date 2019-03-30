package com.zhcwang.resume.dto;

import java.util.List;

public class ProjectDto {

    private List<Project> project;

    public ProjectDto(List<Project> project) {
        this.project = project;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }
}
