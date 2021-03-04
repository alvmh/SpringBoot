package com.example.springboot.dao;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class CovidDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List getCovidData(JSONObject jsonObject){
        StringBuffer sql = new StringBuffer();
        sql.append("select * from covid where 1 = 1 and  x is not null and y is not null ");
        List sqllist = getSql(jsonObject,sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sqllist.get(0)+"", ((List)sqllist.get(1)).toArray());
        return list;
    };

    public static List getSql(JSONObject jsonObject, StringBuffer sql){
        List alist = new ArrayList();
        List paralist = new ArrayList();
        String start = jsonObject.get("start")+"";
        if (!StringUtils.isEmpty(start)){
            sql.append( " and time_report >= ?");
            paralist.add(start);
        }
        String end = jsonObject.get("end")+"";
        if (!StringUtils.isEmpty(end)){
            sql.append( " and time_report <= ?");
            paralist.add(end);
        }
        alist.add(sql);
        alist.add(paralist);
        return alist;
    };

}
