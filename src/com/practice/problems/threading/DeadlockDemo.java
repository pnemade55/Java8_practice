package com.practice.problems.threading;

public class DeadlockDemo {
    public static void main(String[] args) throws InterruptedException {

        String resource1="resource1";
        String resource2="resource2";

        Thread t1= new Thread(){
                @Override
                public void run() {
                    synchronized (resource1) {
                        System.out.println("t1: locking resource1");

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (resource2) {
                            System.out.println("t1: locking resource2");
                        }
                    }
                }
            };

        Thread t2= new Thread(){
            @Override
            public void run() {
                //in order to solve the issue consume resource in same order... resource1 then resource2
                synchronized (resource2) {
                    System.out.println("t2: locking resource2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("t2: locking resource1");
                    }
                }
            }
        };


        t1.start();
        t2.start();
    }
}
