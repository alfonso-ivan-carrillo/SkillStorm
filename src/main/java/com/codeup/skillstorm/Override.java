package com.codeup.skillstorm;

public class Override {

    public static void main(String[] args) {
        Poppable obj = new Ballon();
        obj.pop();

        Poppable obj2 = new Bubble();
        obj2.pop();
    }
}

class Poppable {
    public void pop(){
        System.out.println("Pop");
    }
}

class Ballon extends Poppable {
    public void pop(){
        System.out.println("Pop!");
    }
    // over loading method, since its taking in a parameter
    public void pop (int x ){}
}

class Bubble extends Poppable {
    public void pop(){
        System.out.println("p");
    }
}

