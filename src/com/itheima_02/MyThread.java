package com.itheima_02;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}

/*

    public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }

    private static int threadInitNumber;
    private static synchronized int nextThreadNum() {
        return threadInitNumber++;
    }*/
