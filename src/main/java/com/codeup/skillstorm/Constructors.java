package com.codeup.skillstorm;

class Pizza {
    int slices;
    String topping;
    public void eat(){
        slices = slices - 1;
    }

    public Pizza() {
    }

    public Pizza(int slices) {
        this.slices = slices;
    }

    public Pizza(String topping) {
        this.topping = topping;
    }

    public Pizza(int slices, String topping) {
        this.slices = slices;
        this.topping = topping;
    }
}

public class Constructors {



    public static void main(String[] args) {

    Pizza dominiosPizza = new Pizza();
    dominiosPizza.slices = 8;
        System.out.println(dominiosPizza.slices);

    Pizza pie = new Pizza(6);
    dominiosPizza.eat();

        System.out.println(dominiosPizza.slices);
        System.out.println(pie.slices);
        pie.eat();
        System.out.println(pie.slices);


    }
}
