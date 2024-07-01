package com.practice.problems.oops;

class Animal{
    void eat(){System.out.println("eating...");}
    class waterAnimal{
        void swim(){System.out.println("eating...");}
    }
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Dog{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.bark();
        c.eat();
        
    //c.bark();//C.T.Error
    }
}
