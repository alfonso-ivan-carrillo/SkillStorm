package com.codeup.skillstorm;

public class Logical {

    public static void main(String[] args) {
        boolean holiday = false;
        boolean weekend = true;
        boolean work = true;

        if (holiday || weekend && !work){
            // day off
            System.out.println("It's my day off!");
        } else {
            System.out.println("I have to work today, boo.");
        }

        int x = 10;

        if( x < 10 || x > 0){
            System.out.println("I'm less than ten but more than zero.");
        }
    }
}
