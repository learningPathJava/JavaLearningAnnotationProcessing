package org.example.annotation.user;

import org.example.annotation.processor.BuilderProperty;

public class Person {

    private int age;
    private String name;

    @BuilderProperty
    public void setAge(int age) {
        this.age = age;
    }

    @BuilderProperty
    public void setName(String name) {
        this.name = name;
    }

    // getters

}
