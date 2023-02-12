package com.example.joy_spring.comm.code;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;
@Mapper
public interface CmCodeDao {

    List<Map<String, Object>> getCodeList(Map<String, Object> prmMap);
}
