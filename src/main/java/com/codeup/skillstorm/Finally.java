package com.codeup.skillstorm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

    public static void main(String[] args) {
        FileInputStream f = null;

        try {
            f = new FileInputStream("demo.txt");
            System.out.println((char) f.read());  // cast to char if not it will provide a number reference for letter
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e){
            System.out.println(e);
        } finally {
            System.out.println("finally");
                // try - with resources statement ?
            if(f != null){
                try {
                    f.close();
                } catch (IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}
