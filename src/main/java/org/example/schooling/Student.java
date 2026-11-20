package org.example.schooling;

public class Student {

    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter method called");
        this.age = age;
    }

    public Student() {
        System.out.println("Student Object Created");
    }

    public void code() {
        System.out.println("Coding");
    }

}
