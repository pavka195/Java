package main.block03.lesson21;

import main.block03.lesson21.logger.Logger;
import java.io.IOException;

public class Solution {
    private static Thread[] threads = new Thread[5];
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        Logger.printToConsole();
    }
}