package com.codeup.skillstorm;

public class DoWhile {

    static void loop(boolean running){
        do {
            System.out.println("running");
            running = loopCheck();
        } while(running);
    }

    static boolean loopCheck(){
        if(Math.random() < 0.5){
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        loop(false);
    }
}
