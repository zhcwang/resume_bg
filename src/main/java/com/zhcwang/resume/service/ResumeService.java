package com.zhcwang.resume.service;

import com.zhcwang.resume.dao.ResumeDao;
import com.zhcwang.resume.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    @Autowired
    ResumeDao resumeDao;

    public BaseInfoDto getBaseInfo(){
        BaseInfo baseInfo = resumeDao.getBaseInfo();
        BaseInfoDto baseInfoDto = new BaseInfoDto();
        baseInfoDto.setInfo(baseInfo);
        return baseInfoDto;
    }

    public ExperienceDto getExperience() {
        return new ExperienceDto(resumeDao.getExperience());
    }

    public SkillDto getSkill() {
        return new SkillDto(resumeDao.getSkill());
    }

    public ProjectDto getProject() {
        return new ProjectDto(resumeDao.getProject());
    }
}
