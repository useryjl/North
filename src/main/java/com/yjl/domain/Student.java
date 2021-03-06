package com.yjl.domain;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Integer rr;

    public Integer getRr() {
        return rr;
    }

    public void setRr(Integer rr) {
        this.rr = rr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rr=" + rr +
                '}';
    }
}
