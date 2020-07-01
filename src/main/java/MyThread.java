import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private final Counter counter;
    private final Logger logger = Logger.getLogger(MyThread.class);

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue().get() < Main.FINISH) {
            counter.getValue().getAndIncrement();
            counter.recordToLog();
        }
        logger.info("Thread has finished!");
    }
}
