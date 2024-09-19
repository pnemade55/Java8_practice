package com.practice.designpatterns.Decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        CarDeceorator cd= new CarDeceorator(new LuxuriousCar(new SportsCar(new BasicCar())));
        cd.assemble();
    }
}
