package pl.training.module08.monitor;

import java.util.LinkedList;
import java.util.Queue;

public class Application {

    private static final int THREADS_COUNT = 3;
    private static final int PRINTING_QUEUE_LIMIT = 100;

    public static void main(String[] args) {
        Queue<String> printingQueue = new LinkedList<>();
        new Thread(new Printer(printingQueue)).start();
        for (int threadIndex = 0; threadIndex < THREADS_COUNT; threadIndex++) {
            new Thread(new Employee(printingQueue, PRINTING_QUEUE_LIMIT)).start();
        }
    }

}
