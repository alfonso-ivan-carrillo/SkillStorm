package com.codeup.skillstorm;

public class Interfaces {
    public static void main(String[] args) {
        // can instantiate an instance of a interface
        // Drawable a = new Drawable();
    }
}

interface Drawable {
    void draw();
}

interface Colorable extends Drawable {
    void color();
}

class Rectangle implements Drawable, Runnable {
    public void draw(){
    }

    public void run(){
    }
}

class Circle implements Colorable {
    public void color(){}
    public void draw(){}
}