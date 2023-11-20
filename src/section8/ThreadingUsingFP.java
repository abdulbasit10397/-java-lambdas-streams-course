package section8;

import java.io.IOException;

public class ThreadingUsingFP {
    public static void main (String[] args) throws IOException {
        System.out.println("*********** Creating Thread Without FP *************");
        creatingThreadWithoutFP();
        System.out.println("\n");

        System.out.println("*********** Creating Thread With FP *************");
        creatingThreadWithFP();
        System.out.println("\n");
    }

    private static void creatingThreadWithoutFP() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10000; i++) {
                    System.out.println(Thread.currentThread().getId() + " : " + i);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

    private static void creatingThreadWithFP() {
        Runnable runnable = () -> {
            for (int i = 0; i<10000; i++)
                System.out.println(Thread.currentThread().getId() + " : " + i);
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
