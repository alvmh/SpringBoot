package com.example.springboot.service;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot.dao.CovidDao;
import com.example.springboot.dao.SysDeptDao;
import com.example.springboot.entity.SysDeptEntity;
import com.example.springboot.mapper.SysDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidServiceImpl implements CovidService{

    @Autowired(required = false)
    private CovidDao covidDao;

    @Override
    public List getCovidData(JSONObject jsonObject) {
        return covidDao.getCovidData(jsonObject);
    }

}
