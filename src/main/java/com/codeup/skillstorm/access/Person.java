package com.codeup.skillstorm.access;

public class Person {

    // Computer accessable since within the same package
    Computer pc = new Computer();
    private int age;

    // setter
    public void setAge(int age) {
        this.age = age;
    }
    // getter
    public int getAge() {
        return age;
    }

    public void code(){
        pc.code();
    }



}


