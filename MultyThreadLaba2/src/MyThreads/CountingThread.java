package MyThreads;

import java.util.concurrent.Exchanger;

public class CountingThread extends Thread {
    private Exchanger<Double> exchanger;

    public CountingThread(Exchanger<Double> exchanger, String name) {
        super(name);
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        double pi = 0;
        double denominator = 1;
        int sign = 1;
        while(true) {
            pi += sign * 4 / denominator;
            denominator += 2;
            sign *= -1;
            try {
                exchanger.exchange(pi);
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
