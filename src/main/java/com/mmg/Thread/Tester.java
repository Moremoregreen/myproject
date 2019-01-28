package com.mmg.Thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Main:" + i);
        }
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i+=3) {
                    try {
                        System.out.println("Thread:"+i);
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        //MyThread
        MyThread myThread = new MyThread();
        myThread.start();
        //Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("Runnable:" + i + " RRR");
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        //runnable.run();
        Thread run = new Thread(runnable);
        run.start();

        //Runnable -> Lambda
        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("Runnable Lambda:" + i + " LLL");
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("Main End");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i+=2) {
            try {
                System.out.println(getName()+" ： " + i*10);
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}