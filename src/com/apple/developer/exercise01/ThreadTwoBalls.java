package com.apple.developer.exercise01;

import java.util.List;

@SuppressWarnings("all")
public class ThreadTwoBalls extends Thread {
    private List bigList = TwoBalls.returnList();

    @Override
    public void run() {
        System.out.println("五组双色球：");
        for (Object obj : bigList) {
            List<Integer> list = (List<Integer>) obj;
            for (Object obj01 : list) {
                System.out.print(obj01 + "\t");
            }
            System.out.println();
        }
    }
}
