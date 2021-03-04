package com.example.springboot.controller;


import com.example.springboot.entity.SysDeptEntity;
import com.example.springboot.service.SysDeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SysDeptController {
    protected static Logger logger= LoggerFactory.getLogger(SysDeptController.class);
    @Autowired
    private SysDeptService sysDeptService;

    @RequestMapping("/getSysDeptName")
    @ResponseBody
    public Map<String,Object> getSysDeptName(){
        String deptName = "战略部";
        Map<String,Object> result = new HashMap<String, Object>();
        SysDeptEntity sysDept = sysDeptService.readByFullName(deptName);
        String mysysDept = sysDept.getDescription()+"---"+sysDept.getCreateTime();
        //Assert.notNull(sysDept);
        //result.put("name", sysDept.getFullName());

        String dept = sysDeptService.readByFullName1(deptName);
        result.put("name", mysysDept);
        result.put("dept", dept);
        return result;
    }
}
