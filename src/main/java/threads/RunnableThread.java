package threads;

public class RunnableThread implements Runnable {
    private int[] num;
    private int limit;

    public RunnableThread(int[] num, int limit) {
        this.num = num;
        this.limit = limit;
    }

    @Override
    public void run() {
        while (true) {
            if (num[0] < limit) {
                System.out.println("Runnable: " + num[0]++);
            } else {
                break;
            }
        }
    }
}
