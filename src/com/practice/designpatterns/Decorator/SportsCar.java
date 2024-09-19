package com.practice.designpatterns.Decorator;

public class SportsCar extends CarDeceorator{

    SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding Sports Car features...");
    }
}
