public class Main {

    public static final int FINISH = 100;

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        Thread myRunnable = new Thread(new MyRunnable(counter));
        myThread.start();
        myRunnable.start();
    }
}
