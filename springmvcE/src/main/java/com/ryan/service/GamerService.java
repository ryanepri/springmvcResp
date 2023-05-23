package com.ryan.service;

import com.ryan.pojo.Gamer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Service
@Transactional
public interface GamerService {
    List<Gamer> getAll();

}
