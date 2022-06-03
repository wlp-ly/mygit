package com.itheima_05;

public class MyRunableDemo {
    public static void main(String[] args) {

       MyRunable r=new MyRunable();
      //将ruanable的对象作为参数传递
       Thread t1=new Thread(r,"高铁");
       Thread t2=new Thread(r,"飞机");


       t1.start();
       t2.start();
    }
}
