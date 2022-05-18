package com.codeup.skillstorm;

public class While {

    static void loop(){
        boolean running = check();
        while (running){
            System.out.println("running");
            running = check();
        }
    }

    static boolean check(){
        if(Math.random() < .5){
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        loop();
    }
}
