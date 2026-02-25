package Threads;

public class ThreadDemoSystem {

    static class Worker extends Thread{
        // knows/ contains
        // constructor

        public Worker( String name){
            setName(name);
        }

        public void run() {
            System.out.println(getName() + " (ID: " + getId() + ") started, Priority: " + getPriority());
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " working on task " + i + ", State: " + getState());
                try {
                    Thread.sleep(500); // simulate work
                    if (i == 3 && getName().equals("Worker-2")) {
                        System.out.println(getName() + " yielding CPU...");
                        Thread.yield(); // give other threads chance
                    }
                } catch (InterruptedException e) {
                    System.out.println(getName() + " was interrupted!");
                    return; // exit run
                }
            }
            System.out.println(getName() + " finished work");
        }

    }

    public static void main (String[] args) throws InterruptedException {
        Worker w1 = new Worker("Thread 1");
        Worker w2 = new Worker("Thread 2");
        Worker w3 = new Worker("Thread 3");

        // set priority
        w1.setPriority(Thread.MAX_PRIORITY);
        w2.setPriority(Thread.MIN_PRIORITY);
        w3.setPriority(Thread.NORM_PRIORITY);

        // Make w3 a daemon thread
        w3.setDaemon(true);

        // Start threads
        w1.start();
        w2.start();
        w3.start();

        // Interrupt w2 after 1 second (demonstrate interrupt)
        Thread.sleep(1000);
        System.out.println("Interrupting Worker-2...");
        w2.interrupt();

        // Join w1 and w2
        w1.join();
        w2.join();

        // Check if threads are alive
        System.out.println("Is Worker-1 alive? " + w1.isAlive());
        System.out.println("Is Worker-2 alive? " + w2.isAlive());
        System.out.println("Is Worker-3 alive? " + w3.isAlive());

        // Print toString() info
        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());

        System.out.println("Main thread finished");


    }
}