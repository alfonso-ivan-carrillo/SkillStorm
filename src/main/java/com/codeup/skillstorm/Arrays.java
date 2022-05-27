package com.codeup.skillstorm;

public class Arrays {

    public static void main(String[] args) {
        // array - indicate the type of array, like in this case int and [], after the = sign, in[6] the number of items in array
        int[] array = new int[6];

        array[0] = 155;
        array[5] = 77;
        System.out.println(array[5]);

        // array initializer
        String[] words = {"abc", "def", "jkl"};

        words[0] = "dee";

        String[] mutants = new String[5];
        mutants[0] = "wolverine";
        mutants[1] = "professor x";
        mutants[2] = "beast";
        mutants[3] = "jubliee";
        mutants[4] = "havok";

//        System.out.println(mutants[0]);
//        System.out.println(mutants[2]);

        for (String mutant : mutants
             ) {
            System.out.println(mutant);
        }

    }
}
