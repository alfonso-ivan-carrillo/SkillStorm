package com.codeup.skillstorm;

public class Methods {

    public int go(){
        return 11;
    }

    public static int go(int x){
        return x;
    }

    public static void main(String[] args) {

        Methods example = new Methods();
        int returned = example.go();

        int value = Methods.go(10);

        System.out.println(returned);
        System.out.println(value);
    }



}
