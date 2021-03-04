package com.example.springboot.service;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.entity.SysDeptEntity;

import java.util.List;


public interface CovidService {
    public List getCovidData(JSONObject jsonObject);
}
