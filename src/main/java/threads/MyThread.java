package threads;

import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger LOGGER = Logger.getLogger(MyThread.class);
    private final int[] num;
    private final int limit;

    public MyThread(int[] num,int limit) {
        this.num = num;
        this.limit = limit;
    }

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
