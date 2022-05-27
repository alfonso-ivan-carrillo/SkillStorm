package com.codeup.skillstorm;

public class Shadow {

    public static void main(String[] args) {
        Child child = new Child();
        int returned = child.getX();
        System.out.println(returned);
        System.out.println(child.getX());
    }
}

class Parent {
    // super.x or parent.x
    int x = 10;
}

class Child extends Parent {
    // this.x or child.x
    int x = 5;

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        // returns the value of the child class
        return x;
        // returns the value of the current method by using this.x
        // return this.x;

        // super.x returns the value of the parent class Parent
        // return super.x;
    }
}
