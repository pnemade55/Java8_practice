package com.practice.problems.streams;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListofAnimalsToMP {
    public static void main(String[] args) {

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(new Animal("tiger","land"));
        animals.add(new Animal("fish","water"));
            Map<String, Animal> map = animals.stream()
                    .collect(Collectors.toMap(Animal::getName, a-> a));

            map.entrySet().stream().forEach(e -> System.out.println(e.getKey()+e.getValue()));
    }
}
