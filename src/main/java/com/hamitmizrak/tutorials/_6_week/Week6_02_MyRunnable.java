package com.hamitmizrak.tutorials._6_week;

public class Week6_02_MyRunnable  implements Runnable  {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Sayı: " + (i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread kesintiye uğradı!");
            }
        }
    }
}


class RunnableExample {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Week6_02_MyRunnable());
        Thread thread2 = new Thread(new Week6_02_MyRunnable());
        Thread thread3 = new Thread(new Week6_02_MyRunnable());

        thread1.start();
        thread2.start();
        thread2.join(); //üsteki Threadler bitmeden sen başlamayacaksın.
        thread3.start();
    }
}