package com.ryan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gamer implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String photo;
    private String filetype;
}
