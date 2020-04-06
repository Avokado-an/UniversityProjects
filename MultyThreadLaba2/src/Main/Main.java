package Main;

import MyThreads.CountingThread;
import MyThreads.ExpressionOutputtingThread;
import MyThreads.OutputtingThread;

import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<Double> exchanger = new Exchanger<>();
        new ExpressionOutputtingThread("expressionOutput").start();
        new CountingThread(exchanger, "countingThread").start();
        new OutputtingThread(exchanger, "outputtingThread").start();
    }
}
