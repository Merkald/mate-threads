package threads;

public class MyThread extends Thread {
    private int[] num;
    private int limit;

    public MyThread(int[] num,int limit) {
        this.num = num;
        this.limit = limit;
    }

    public void run() {
        while (true) {
            if (num[0] < limit) {
                System.out.println("Thread: " + num[0]++);
            } else {
                break;
            }
        }

    }
}
