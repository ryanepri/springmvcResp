package com.ryan.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ryan.pojo.Pet;
import org.junit.jupiter.api.Test;

public class TestJson {

    @Test
    public void testA() throws JsonProcessingException {
        Pet pet = new Pet("tom", "cat");
        ObjectMapper om = new ObjectMapper();
        String asString = om.writeValueAsString(pet);
        System.out.println(asString);
    }
}
