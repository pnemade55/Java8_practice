package com.practice.designpatterns.Decorator;

public class CarDeceorator implements Car{

    private Car car;

    CarDeceorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
