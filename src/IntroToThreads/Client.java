package IntroToThreads;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello World, Printed by "+Thread.currentThread().getName());

       // HelloWorldPrinter hw = new HelloWorldPrinter();
        //Thread thread = new Thread(hw);
        //thread.start();


        for(int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }




    }
}
