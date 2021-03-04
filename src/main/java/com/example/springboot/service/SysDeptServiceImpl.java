package com.example.springboot.service;

import com.example.springboot.dao.SysDeptDao;
import com.example.springboot.entity.SysDeptEntity;
import com.example.springboot.mapper.SysDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysDeptServiceImpl implements SysDeptService{

    @Autowired(required = false)
    private SysDeptDao sysDeptDao;

    @Autowired(required = false)
    private SysDeptMapper sysDeptMapper;

    @Override
    public SysDeptEntity readByFullName(String name) {
        return sysDeptMapper.readByFullName(name);
    }

    @Override
    public String readByFullName1(String name) {
        return sysDeptDao.readByFullName(name);
    }

}
