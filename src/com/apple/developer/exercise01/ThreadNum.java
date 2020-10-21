package com.apple.developer.exercise01;

public class ThreadNum extends Thread {
    @Override
    public void run() {
        int n = 0;
        System.out.println("\n输出奇数：");
        while (true && n < 100) {
            if (n % 2 != 0) {
                System.out.println(n + "\t");
            }
            n++;
        }
    }
}
