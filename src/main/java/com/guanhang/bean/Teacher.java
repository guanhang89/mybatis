package com.guanhang.bean;

public class Teacher {
    private String id;

    private String name;

    private String gender;

    private Integer age;

    private String course;

    private String classfor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course == null ? null : course.trim();
    }

    public String getClassfor() {
        return classfor;
    }

    public void setClassfor(String classfor) {
        this.classfor = classfor == null ? null : classfor.trim();
    }
}