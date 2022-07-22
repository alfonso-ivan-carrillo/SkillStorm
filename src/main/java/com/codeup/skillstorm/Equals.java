package com.codeup.skillstorm;

public class Equals {

    public static void main(String[] args) {

        Pizzas one = new Pizzas();
        Pizzas two = new Pizzas();
        System.out.println(one == two);
        System.out.println(one.equals(two));

    }
}

class Pizzas {
    int size = 0;
    String topping = null;

    public boolean equals(Object o){
        Pizzas other = (Pizzas) o;
        if(this.size == other.size){
            if(this.topping == other.topping){
                return true;
            }
        }
        return false;
    }
}
