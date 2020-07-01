import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

public class Counter {
    private final Logger logger = Logger.getLogger(Counter.class);
    private final AtomicInteger value = new AtomicInteger(0);

    public AtomicInteger getValue() {
        return value;
    }

    public void recordToLog() {
        logger.info(Thread.currentThread().getName() + " value = " + value.get());
    }
}
