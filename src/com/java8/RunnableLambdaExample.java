package com.java8;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior to Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };

        new Thread(runnable).start();

        //Java 8 Lambda () -> {}
        Runnable runnable1 = () -> {
            System.out.println("Inside Runnable Java 8");
        };
        new Thread(runnable1).start();


        new Thread(()->System.out.println("-- Inside Runnable Java 8 --")).start();
    }
}
