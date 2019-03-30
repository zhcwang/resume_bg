package com.zhcwang.resume.controller;

import com.zhcwang.resume.dto.BaseInfoDto;
import com.zhcwang.resume.dto.ExperienceDto;
import com.zhcwang.resume.dto.ProjectDto;
import com.zhcwang.resume.dto.SkillDto;
import com.zhcwang.resume.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumeController {

    @Autowired
    ResumeService resumeService;

    @RequestMapping(path="/api/resume", method=RequestMethod.GET)
    public BaseInfoDto getBaseInfo(){
        return resumeService.getBaseInfo();
    }

    @RequestMapping(path="/api/experience", method=RequestMethod.GET)
    public ExperienceDto getExperience(){
        return resumeService.getExperience();
    }

    @RequestMapping(path="/api/skill", method=RequestMethod.GET)
    public SkillDto getSkill(){
        return resumeService.getSkill();
    }

    @RequestMapping(path="/api/project", method=RequestMethod.GET)
    public ProjectDto getProject(){
        return resumeService.getProject();
    }
}
