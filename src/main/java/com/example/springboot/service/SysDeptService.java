package com.example.springboot.service;

import com.example.springboot.entity.SysDeptEntity;


public interface SysDeptService {
    public SysDeptEntity readByFullName(String name);
    public String readByFullName1(String name);
}
