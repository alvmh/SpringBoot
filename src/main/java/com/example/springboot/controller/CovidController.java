package com.example.springboot.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.springboot.entity.SysDeptEntity;
import com.example.springboot.service.CovidService;
import com.example.springboot.service.SysDeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CovidController {
    protected static Logger logger= LoggerFactory.getLogger(CovidController.class);
    @Autowired
    private CovidService covidService;

    @RequestMapping("/getCovidData")
    @ResponseBody
    public List<Object> getCovidData(@RequestBody JSONObject jsonObject){
        Map<String,Object> result = new HashMap<String, Object>();
        List covidData = covidService.getCovidData(jsonObject);
        result.put("covidData", covidData);
        return covidData;
    }
}
