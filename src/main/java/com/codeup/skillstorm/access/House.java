package com.codeup.skillstorm.access;

public class House {

    public void tenant(){
        Person person = new Person();
        // cannot access age property in Person class due to being set as Private, need to access the setter method of setAge()
        person.setAge(10);

        person.pc = new Computer();
    }
}
