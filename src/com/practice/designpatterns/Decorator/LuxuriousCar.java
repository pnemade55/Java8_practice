package com.practice.designpatterns.Decorator;

public class LuxuriousCar extends CarDeceorator{

    public LuxuriousCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding Luxurious Car features.....");
    }
}
