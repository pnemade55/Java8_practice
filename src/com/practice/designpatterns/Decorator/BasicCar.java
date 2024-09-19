package com.practice.designpatterns.Decorator;

public class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("creating Basic Car.");
    }
}
