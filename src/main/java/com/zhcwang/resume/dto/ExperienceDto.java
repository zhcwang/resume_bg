package com.zhcwang.resume.dto;

import java.util.List;

public class ExperienceDto {

    private List<Experience> experience;

    public ExperienceDto(List<Experience> experience) {
        this.experience = experience;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }
}
