package com.practice.designpatterns;

public class SingletonPattern {
    public static volatile SingletonPattern INSTANCE =null;

    private SingletonPattern(){
    }

    public static SingletonPattern getInstance(){
        if(INSTANCE== null){
            synchronized (SingletonPattern.class){
                if (INSTANCE== null){
                    INSTANCE= new SingletonPattern();
                }
            }
        }
        return INSTANCE;
    }
}

class TestSingleton{
    public static void main(String[] args) {
        SingletonPattern singleton= SingletonPattern.getInstance();
        SingletonPattern singleton1= SingletonPattern.getInstance();
        SingletonPattern singleton3= SingletonPattern.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton3);

        System.out.println(singleton1==singleton3);
    }
}