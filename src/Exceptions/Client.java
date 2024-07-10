package Exceptions;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        fun();
    }

    public static void fun(){
        try {
            System.out.println("Hello");
            System.out.println("world");

            File file = new File("abc.txt");
            FileReader fileReader = new FileReader(file);
            fileReader.read();


            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = a / b;

            System.out.println("bye");
            System.out.println("goodbye");

        }
        catch(FileNotFoundException e){
            System.out.println("Handled file not found exception");
        }
        catch(IOException e){
            System.out.println("Handled IO exception");
        }
        catch(InputMismatchException e){
            System.out.println("handled input mismatch exception");
        }
        catch(ArithmeticException e){
            //divide by 0 exception
            System.out.println("handled arithmetic exception");
        }
        catch(Exception e){
            System.out.println("parent exception class");
        }

        finally{
            System.out.println("Finally block");
            //Finally block gets executed even when we have a return statement in the try block
            //Sustem.exit(0) - only in this case finally block will not be executed
        }

    }
}
