package com.zhcwang.resume.dto;

import java.util.List;

public class SkillDto {

    private List<Skill> skill;

    public SkillDto(List<Skill> skill) {
        this.skill = skill;
    }

    public List<Skill> getSkill() {
        return skill;
    }

    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }
}
