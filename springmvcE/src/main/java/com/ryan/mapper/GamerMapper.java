package com.ryan.mapper;

import com.ryan.pojo.Gamer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamerMapper {
    List<Gamer> selectAll();
}
