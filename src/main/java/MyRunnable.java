import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private final Counter counter;

    private final Logger logger = Logger.getLogger(MyRunnable.class);

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue().get() < Main.FINISH) {
            counter.getValue().getAndIncrement();
            counter.recordToLog();
        }

        logger.info("Runnable has finished!");
    }
}
