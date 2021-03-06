import model.IntValue;
import threads.MyThread;
import threads.RunnableThread;

public class Main {
    public static void main(String[] args) {
        IntValue num = new IntValue();
        MyThread thread1 = new MyThread(num, 100);
        RunnableThread runnableThread = new RunnableThread(num, 100);
        Thread thread2 = new Thread(runnableThread);
        thread1.start();
        thread2.start();
    }
}
