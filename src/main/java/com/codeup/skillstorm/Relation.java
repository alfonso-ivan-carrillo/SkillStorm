package com.codeup.skillstorm;

public class Relation {

    public static void main(String[] args) {

        boolean eq = 5 == 4;    // will result in false
        boolean ne = 5!= 4;     // will result in true

        boolean gt = 5 > 4;     // true
        boolean lt = 5 < 4;     // false
        boolean ge = 5 >= 4;    // true
        boolean le = 5 <= 4;    // false

//        these operators can also be used in
//                if statments like this: if (eq){}
//                or in while loops like this: while(ne){}

        System.out.println(eq);
        System.out.println(ne);
        System.out.println(gt);
        System.out.println(lt);
        System.out.println(ge);
        System.out.println(le);
    }
}
