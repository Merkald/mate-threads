package threads;

import org.apache.log4j.Logger;

public class RunnableThread implements Runnable {
    private static final Logger LOGGER = Logger.getLogger(RunnableThread.class);
    private final int[] num;
    private final int limit;

    public RunnableThread(int[] num, int limit) {
        this.num = num;
        this.limit = limit;
    }

    @Override
    public void run() {
        while (true) {
            if (num[0] < limit) {
                LOGGER.info("Thread: " + num[0]++);
            } else {
                break;
            }
        }
    }
}
