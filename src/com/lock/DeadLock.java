package com.lock;


/**
 * 死锁条件
 * 1 持有并请求
 * 2 不可被抢断
 * 3 循环等待
 * 4 互斥
 */

public class DeadLock {
    private static Object source1 = new Object();
    private static Object source2 = new Object();



    public static void main(String[] args) {
        new Thread(()->{

            synchronized (source1){
                System.out.println(Thread.currentThread()+"     "+source1);
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (DeadLock.source2){
                    System.out.println(Thread.currentThread());

                }
            }
        },"source1").start();


        new Thread(()->{

            synchronized (source2){
                System.out.println(Thread.currentThread()+"     "+source2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (DeadLock.source1){
                    System.out.println("调用    "+source1);

                }
            }
        },"source2").start();
    }
}
