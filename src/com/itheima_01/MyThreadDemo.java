package com.itheima_01;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
      /*  my1.run();
        my2.run();*/

        my1.start();
        my2.start();

    }
}
