package com.ryan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    String pname;
    String page;
    String gender;
    String[] hobby;
    String birthdate;
}
