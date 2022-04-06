package src.main.java.multithreading;

public class UserThread implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("User Thread");
        }
    }
}
