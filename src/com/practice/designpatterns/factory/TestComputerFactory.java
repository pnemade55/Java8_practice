package com.practice.designpatterns.factory;

public class TestComputerFactory {

    public static void main(String[] args) {
       Computer c=  ComputerFactory.getComputer("PC","16GB", "256GB SSD", "2.5 GHz");

       System.out.println(c);
    }
}
