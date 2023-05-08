package com.ryan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alien {
    private Date datetime;

    private String[] hobby;

    private List<Pet> pets;

    Map<String, Pet> petMap;

    private Dc dc;
}
