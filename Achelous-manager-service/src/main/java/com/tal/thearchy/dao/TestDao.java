package com.tal.thearchy.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("testDao")
public interface TestDao {

     List<Map<String,Object>> getInfo();
}
