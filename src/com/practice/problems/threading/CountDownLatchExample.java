package com.practice.problems.threading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl= new CountDownLatch(4);

        Worker w1= new Worker(100, cdl,"worker1");
        Worker w2= new Worker(200, cdl,"worker2");
        Worker w3= new Worker(300, cdl,"worker3");
        Worker w4= new Worker(400, cdl,"worker4");

        w1.start();
        w2.start();
        w3.start();
        w4.start();

        cdl.await();

        System.out.println("Thread " + Thread.currentThread().getName() + " has finished");
    }
}

class Worker extends Thread{

    private int delay;
    private CountDownLatch CDLatch;

    public Worker(int delay, CountDownLatch CDLatch, String name)
    {
        super(name);
        this.delay = delay;
        this.CDLatch = CDLatch;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(delay);
            CDLatch.countDown();
            System.out.println(Thread.currentThread().getName()+" has Finished");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
