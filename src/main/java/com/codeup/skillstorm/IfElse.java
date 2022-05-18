package com.codeup.skillstorm;

public class IfElse {

    static void branch(boolean cond){
        if (cond){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {

        branch(true);

        branch(false);
    }
}
