package com.practice.problems.streams;

public class Animal {
    private String name;
    private String environment;

    public Animal(String name, String environment) {
        this.name = name;
        this.environment = environment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", environment='" + environment + '\'' +
                '}';
    }
}
