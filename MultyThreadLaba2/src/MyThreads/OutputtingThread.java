package MyThreads;

import java.util.concurrent.Exchanger;

public class OutputtingThread extends Thread{
    private Exchanger<Double> exchanger;

    public OutputtingThread(Exchanger<Double> exchanger, String name) {
        super(name);
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        Double pi = 4.;
        while (true) {
            try {
                pi = exchanger.exchange(pi);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" = " + pi);
        }
    }
}
