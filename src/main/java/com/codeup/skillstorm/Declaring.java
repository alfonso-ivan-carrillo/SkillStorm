package com.codeup.skillstorm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Declaring {


    public static void main(String[] args) {
//        read(); // exception must be handled somewhere

    }
    // declaring the exception
    static void read() throws FileNotFoundException {
        FileInputStream file =  new FileInputStream("file.txt");
    }
}
