package com.ryan.service.impl;

import com.ryan.pojo.Gamer;
import com.ryan.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ryan.mapper.GamerMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class GamerServiceImpl implements GamerService {
    @Autowired
    GamerMapper gamerMapper;

    public List<Gamer> getAll() {
        return gamerMapper.selectAll();
    }

    public List<Gamer> selectGamer() {
        return null;
    }


    //回填gamer
    public Integer insertGamer(Gamer gamer) {

//        <!--id, username, password, nickname, photo, filetype-->
        Map map = new HashMap<String, Object>();
        map.put("username", gamer.getUsername());
        map.put("password", gamer.getPassword());
        map.put("nickname", gamer.getNickname());
        map.put("photo", gamer.getPhoto());
        map.put("filetype", gamer.getFiletype());


        return gamerMapper.insertGamer(map);
    }

    public List<Gamer> selectGamer(Gamer gamer) {
        return gamerMapper.selectGamer(gamer);
    }


}
