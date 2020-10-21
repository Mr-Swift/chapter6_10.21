package com.apple.developer.exercise01;

@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args) {
        ThreadTwoBalls threadTwoBalls = new ThreadTwoBalls();
        ThreadNum threadNum = new ThreadNum();
        threadTwoBalls.start();
        try {
            threadTwoBalls.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadNum.start();
    }
}
