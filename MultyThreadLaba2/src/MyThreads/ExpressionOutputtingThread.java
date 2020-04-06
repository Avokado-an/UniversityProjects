package MyThreads;

public class ExpressionOutputtingThread extends Thread {
    public ExpressionOutputtingThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        StringBuilder expression = new StringBuilder();
        int pi = 4;
        int denominator = 1;
        int sign = 1;
        while(true) {
            if(sign < 0)
                expression.append(pi * sign).append("/").append(denominator);
            else
                expression.append("+").append(pi).append("/").append(denominator);
            denominator += 2;
            sign *= -1;
            System.out.println(expression);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
