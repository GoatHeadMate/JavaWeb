package com.goatheadmate.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.goatheadmate.poko.Dog;
import com.goatheadmate.poko.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/19-07-19-下午4:45
 * Description: com.gotaheadmate.test
 * Version: 1.0
 */
public class TestJson {
    @Test
    public void testWriteJson() throws JsonProcessingException {
        Dog dog = new Dog("小黄");
        Person person = new Person("张三",18,dog);
        // 将Person对象转化为字符串
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }

    @Test
    public void testReadJson() throws JsonProcessingException {
        String personStr="{\"name\":\"张三\",\"age\":18,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(personStr, Person.class);
        System.out.println(person);
    }

    @Test
    public void testMapJson() throws JsonProcessingException {
        Map data = new HashMap();
        data.put("a","valuea");
        data.put("b","valueb");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(data);
        System.out.println(s);
    }

    @Test
    public void testListJson() throws JsonProcessingException {
        List data = new ArrayList();
        data.add("valuea");
        data.add("valueb");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(data);
        System.out.println(s);
        Dog dog = new Dog("小黄");
        Person person = new Person("张三",18,dog);
        List lista=new ArrayList();
        lista.add(person);
        ObjectMapper mapper2 = new ObjectMapper();
        String s2=mapper2.writeValueAsString(lista);
        System.out.println(s2);
    }
}
