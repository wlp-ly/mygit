package com.itheima_04;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin j1 = new ThreadJoin();
        ThreadJoin j2 = new ThreadJoin();
        ThreadJoin j3 = new ThreadJoin();


        j1.setName("康熙");

        j2.setName("四阿哥");

        j3.setName("八阿哥");

        j1.start();
        j1.join();
        j2.start();
        j3.start();
    }
}
