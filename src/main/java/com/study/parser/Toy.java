package com.study.parser;

import java.io.IOException;
import java.io.Serializable;

public class Toy implements Serializable {

    private static int count = 424242;
    private final static int a = 2;
    private final static long b = 2L;
    private final static float c = 3.3f;
    private final static double d = 3.1415;

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
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("count: " + count);
    }

    private void f() {
        int a = 1;
        try {
            a++;
        } catch (Exception e) {
            e.printStackTrace();
        }
        int b = a * a;
        System.out.println(b);
    }
}
