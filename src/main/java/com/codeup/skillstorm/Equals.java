package com.codeup.skillstorm;

public class Equals {

    public static void main(String[] args) {

        Pizzas one = new Pizzas();
        one.size = 14;
        one.topping = "Pepperoni";
        Pizzas two = new Pizzas();
        two.size = 14;
        two.topping = "Cheese";
        System.out.println((one == two) + " 1");  // bad practice to use == in java when comparing
        System.out.println(one.equals(two) + " 2");

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

    }
}

class Pizzas {
    int size = 0;
    String topping = null;
//    public int hashCode() {
//        if (topping != null) {
//            return size * topping.hashCode();
//        } else {
//            return size;
//        }
//    }
    public boolean equals(Object o){
        Pizzas other = (Pizzas) o;
        if(this.size == other.size){
            if(this.topping == other.topping){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + size;
        result = prime * result + ((topping == null) ? 0 : topping.hashCode());
        return result;
    }

}
