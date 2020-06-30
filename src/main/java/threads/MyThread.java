package threads;

import model.IntValue;
import org.apache.log4j.Logger;

public class MyThread extends Thread {
    private static final Logger LOGGER = Logger.getLogger(MyThread.class);
    private IntValue num;
    private final int limit;

    public MyThread(IntValue num,int limit) {
        this.num = num;
        this.limit = limit;
    }

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
