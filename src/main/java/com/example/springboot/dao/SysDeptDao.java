package com.example.springboot.dao;

import com.example.springboot.entity.SysDeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Component
public class SysDeptDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String readByFullName(String name){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select simple_name from sys_dept where full_name = ?",name);
        return list.get(0).get("simple_name")+"";
    };
}
