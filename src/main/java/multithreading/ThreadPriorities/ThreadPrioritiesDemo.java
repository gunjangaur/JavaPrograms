package src.main.java.multithreading;

public class ThreadPrioritiesDemo {

    public static void main(String[] args) {

        Thread thread = new Thread(new UserThread());
        thread.start();
        Thread.currentThread().setPriority(10);
        for(int i=0;i<1000;i++){
            System.out.println("Main Thread");

        }
    }
}
