package com.ryan.service.impl;

import com.ryan.pojo.Gamer;
import com.ryan.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ryan.mapper.GamerMapper;

import java.util.List;

@Service
@Transactional
public class GamerServiceImpl implements GamerService {
    @Autowired
    private GamerMapper gamerMapper;

    public List<Gamer> getAll() {
        return gamerMapper.selectAll();
    }
}
