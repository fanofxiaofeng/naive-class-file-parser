package com.study.parser;

import java.io.IOException;
import java.io.Serializable;

public class Toy implements Serializable {

    private static int count = 0;

    public static void main(String[] args) throws Exception, IOException, ArithmeticException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    int before = count;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int after = before + 1;
//                    System.out.println(after);
                    count = after;
                }
            }
        };
        int N = 10;
        Thread[] threads = new Thread[N];
        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("count: " + count);
    }
}
