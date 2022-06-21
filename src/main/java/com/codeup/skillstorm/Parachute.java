package com.codeup.skillstorm;

public class Parachute {

    public static void main(String[] args) {
        pull();
    }
    // best practice to run custom exception than general exceptions
    static void pull() throws DeploymentException{
        if(Math.random() < 0.001){
            throw  new DeploymentException();
        }
    }
}

class DeploymentException extends RuntimeException{}
