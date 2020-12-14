package com.example.springboot.mapper;

import com.example.springboot.entity.SysDeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Mapper
public interface SysDeptMapper{
     SysDeptEntity readByFullName(String name);
}
