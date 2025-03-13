package com.hamitmizrak.tutorials._6_week;

// extends Thread
public class Week6_01_MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Değer: " + i);
            try {
                Thread.sleep(1000); // 1 saniye beklet
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı!");
            }
        }
    }
}

// extends Thread (Main)
 class ThreadExample {
    public static void main(String[] args) {
        Week6_01_MyThread thread1 = new Week6_01_MyThread();
        Week6_01_MyThread thread2 = new Week6_01_MyThread();

        thread1.start(); // Yeni bir iş parçacığı başlatır
        thread2.start();
    }
}