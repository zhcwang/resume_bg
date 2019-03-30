package com.zhcwang.resume.dao;

import com.zhcwang.resume.dto.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResumeDao {
    @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "wanted", column = "wanted"),
            @Result(property = "education", column = "education"),
            @Result(property = "birth", column = "birth"),
            @Result(property = "description", column = "description"),
            @Result(property = "state", column = "state")
    })
    @Select("SELECT name,phone,wanted,education,birth,description,state FROM RESUME_BASEINFO")
    BaseInfo getBaseInfo();


    @Select("SELECT `from`,`to`,workspace,position FROM RESUME_EXPERIENCE")
    List<Experience> getExperience();

    @Select("SELECT `name`,qualification FROM RESUME_SKILL")
    List<Skill> getSkill();

    @Select("SELECT name FROM RESUME_PROJECT_RES WHERE project_id = #{projectId}")
    List<String> getResbonsiblilityByProjectId(String projectId);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "resbonsiblility", column = "id",
                    many = @Many(select = "com.zhcwang.resume.dao.ResumeDao.getResbonsiblilityByProjectId"))
    })
    @Select("SELECT id,`name`,`description`,`content` FROM RESUME_PROJECT")
    List<Project> getProject();


}
