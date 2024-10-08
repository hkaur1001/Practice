package Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i=1; i<=100; i++){

            if(i==5 || i==10 || i==99)
                System.out.println("DEBUG");

            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }
    }
}
