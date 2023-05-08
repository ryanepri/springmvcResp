package com.ryan.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import javafx.scene.effect.PerspectiveTransform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;

    //@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT-8")失效、老老实实转换器
    private Date birthdate;
    //接收list类型
    private List<Pet> pets;
    //接收Map类型
    private Map<String, Pet> petMap;


}
