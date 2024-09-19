package com.practice.problems.threading;

import java.util.concurrent.*;

public class CyclicBarrierExample {

    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        ExecutorService es= Executors.newFixedThreadPool(4);
        CyclicBarrier cb= new CyclicBarrier(4);

        try {
            for (int i = 0; i < 4; i++) {
                es.submit(() -> {
                            new ZooManager().performTasks(cb);
                        }
                );
            }
        } finally {
            es.shutdown();
        }

    }
}

class ZooManager{

    public void removeLion() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+" has removedLion");
    }
    public void cleanCage() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+" has CleanedCage");
    }
    public void addLion() throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+" has AddedLion");
    }

    public void performTasks(CyclicBarrier c1){

        try {
            removeLion();
            c1.await();                   //set of threads to wait for each other
            cleanCage();
            addLion();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
