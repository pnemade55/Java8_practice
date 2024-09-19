package com.practice.designpatterns.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String RAM, String HDD, String CPU){

        if(type.equals("PC"))
            return new PC(RAM, HDD, CPU);
        else if(type.equals("Server"))
            return new Server(RAM, HDD, CPU);
        else return null;
    }
}
