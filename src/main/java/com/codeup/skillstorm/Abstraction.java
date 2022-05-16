package com.codeup.skillstorm;

public class Abstraction {

    public static void main(String[] args) {
        // can not instantiate an object from an abstract class
      //  Shape shape = new Shape();
        Triangle tri = new Triangle();
        System.out.println(tri.area());
        Square sq = new Square();
        System.out.println(sq.area());


    }
}

abstract class Shape {
    int var;
    abstract double area();
}

class Triangle extends Shape {
    double area(){
        return 10;
    }
}

class Square extends Shape {
    double area() {
        return 50;
    }
}
