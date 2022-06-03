package com.itheima_03;

public class Demo {
    public static void main(String[] args) {
        ThreadPriority d1=new ThreadPriority();
        ThreadPriority d2=new ThreadPriority();
        ThreadPriority d3=new ThreadPriority();


        d1.setName("高铁");
        d2.setName("飞机");
        d3.setName("汽车");

        System.out.println(d1.getPriority());
        System.out.println(d2.getPriority());
        System.out.println(d3.getPriority());
        d1.setPriority(5);
        d2.setPriority(10);
        d3.setPriority(1);

        d1.start();
        d2.start();
        d3.start();
    }

}
