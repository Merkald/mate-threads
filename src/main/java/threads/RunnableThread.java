package threads;

import model.IntValue;
import org.apache.log4j.Logger;

public class RunnableThread implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(RunnableThread.class);
    private final IntValue num;
    private final int limit;

    public RunnableThread(IntValue num, int limit) {
        this.num = num;
        this.limit = limit;
    }

    @Override
    public void run() {
        while (true) {
            if (num.getValue() < limit) {
                LOGGER.info("Thread: " + num.getValue());
                num.increment();
            } else {
                break;
            }
        }
    }
}
