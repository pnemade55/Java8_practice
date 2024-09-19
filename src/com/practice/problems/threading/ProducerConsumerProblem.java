package com.practice.problems.threading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> bq= new ArrayBlockingQueue<>(10);

        Producer producer= new Producer(bq);
        Consumer consumer = new Consumer(bq);

        producer.start();
        consumer.start();
        //consumer.join();

    }
}

class Producer extends Thread{

    private BlockingQueue<Integer> queue;

    Producer(BlockingQueue<Integer> bqueue){
        this.queue=bqueue;

    }

    @Override
    public void run() {
        try {
            while (true) {
                for (int i = 0; i < 10; i++) {
                    queue.put(i);
                    System.out.println("Produced resource - Queue size now = " + queue.size());
                    if(i%2==0){
                       // Thread.sleep(200);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread{

    private BlockingQueue<Integer> queue;

    Consumer(BlockingQueue<Integer> bqueue){
        this.queue=bqueue;

    }
    @Override
    public void run() {
        try {
            while (true) {
                    queue.take();
                    Thread.sleep(100);
                    System.out.println("Consumed resource - Queue size now = "  + queue.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
