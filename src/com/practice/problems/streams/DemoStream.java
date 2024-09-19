package com.practice.problems.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {

        class  Student {
           private int id;
            private String name;
            private int age;
            Student(int i, String j, int k){
                id=i;
                name=j;
                age=k;

            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        List<Student> std = new ArrayList<>();
        // add the member of list
        std.add(new Student(1, "ajay",1993));
        std.add(new Student(2, "parag",1993));
        std.add(new Student(3, "abhijeet",1992 ));
        std.add(new Student(4, "tejas",1994));
        std.add(new Student(5, "sumit",1991));
        std.add(new Student(6, "akshay",1990));


        //Sorting based on salary:
       List<Student> sorted=  std.stream()
                .sorted(Comparator.comparingDouble(Student::getAge))
                .collect(Collectors.toList());

       System.out.println(sorted);

        // return 3rd highest salary

       String studentName=  std.stream()
                .sorted(Comparator.comparingDouble(Student::getAge).reversed())
                .skip(2)
                .findFirst()
                .get()
                .getName();

       System.out.println(studentName);


        //

        LinkedHashMap<Integer, String> students = std.stream()
                .collect(Collectors.toMap(
                        s -> s.getId(), s -> s.name, (x, y)-> x + ", " + y, LinkedHashMap::new));

        LinkedHashMap<Integer,Integer> lhm= new LinkedHashMap<>();
        lhm.put(1,2);
        lhm.put(2,3);
        lhm.put(3,8);
        lhm.put(4,10);
        lhm.put(5,16);


        int sum= lhm.entrySet()
                .stream()
                .filter(e -> e.getValue()%2==0)
                .map(e -> e.getValue())
                .mapToInt(a->a)
                .sum();

        System.out.println(sum);

        int result[]= lhm.entrySet()
                .stream()
                .filter(e -> e.getValue()%2==0)
                .map(e -> e.getKey())
                .mapToInt(a->a)
                        .toArray();

       System.out.println(Arrays.stream(result).skip(1).findFirst().getAsInt());


       int[] arr= new int[]{4,1,6,8,2,9,7};

       List<Integer> ls= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

       ls.stream().filter(a -> a>4).forEach(a-> System.out.println("#"+a));
        //int result1[]= ls.stream().mapToInt(a -> a).toArray();
    }
}
