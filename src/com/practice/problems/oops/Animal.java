package com.practice.problems.oops;

class Animal{
    void eat(){System.out.println("eating...");}
    class waterAnimal{
        void swim(){System.out.println("may Swim...");}
    }
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
    //void eat(){System.out.println("Bones");};
}
class Cat extends Dog{
    void meow(){System.out.println("meowing...");}
    void eat(){System.out.println("Fish");};
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.bark();
        c.meow();
        c.eat();

        Animal a= new Cat();
        a.eat(); //fish --->>  Parent = Child is called "UpCasting".
        //a.bark();  a.meow(); is not allowed


        Animal animal= new Cat();
        Cat c1= (Cat)animal;
        c1.eat();// fish -->> Child = Parent reference is called "DownCasting"

    }
}
