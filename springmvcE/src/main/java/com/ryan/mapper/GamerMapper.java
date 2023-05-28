package com.ryan.mapper;

import com.ryan.pojo.Gamer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GamerMapper {
    List<Gamer> selectAll();

    Integer insertGamer(Map<String, Object> map);

    List<Gamer> selectGamer(Gamer gamer);
}
