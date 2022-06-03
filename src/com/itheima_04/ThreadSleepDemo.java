package com.itheima_04;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep s1 = new ThreadSleep();
        ThreadSleep s2 = new ThreadSleep();
        ThreadSleep s3 = new ThreadSleep();

        s1.setName("曹操");

        s2.setName("刘备");

        s3.setName("孙权");

        s1.start();
        s2.start();
        s3.start();
    }

}
