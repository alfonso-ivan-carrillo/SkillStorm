package com.codeup.skillstorm;

public class Abstraction {

    public static void main(String[] args) {
        // can not instantiate an object from an abstract class
      //  Shape shape = new Shape();

    }
}

abstract class Shape {
    int var;
    abstract double area();
}

class Triangle extends Shape {
    double area(){
        return 0;
    }
}

class Square extends Shape {
    double area() {
        return 10;
    }
}
