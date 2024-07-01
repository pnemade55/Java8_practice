package com.practice.problems.streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {

        class  Student {
           private int id;
            private String name;
            Student(int i, String j){
                id=i;
                name=j;

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
        }
        List<Student> lt = new ArrayList<>();
        // add the member of list
        lt.add(new Student(1, "Geeks"));
        lt.add(new Student(2, "For"));

        LinkedHashMap<Integer, String> students = lt.stream()
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
