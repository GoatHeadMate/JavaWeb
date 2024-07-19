package com.goatheadmate.poko;

import java.util.Objects;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/19-07-19-下午4:38
 * Description: com.goatheadmate.poko
 * Version: 1.0
 */
public class Dog {
    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    private String name;

    public Dog(){

    }

}
