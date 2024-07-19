package com.goatheadmate.poko;

import java.util.Objects;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/19-07-19-下午4:42
 * Description: com.goatheadmate.poko
 * Version: 1.0
 */
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age) && Objects.equals(dog, person.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dog);
    }

    public Person(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    private String name;
    private Integer age;
    private Dog dog;

    public Person(){

    }

}
