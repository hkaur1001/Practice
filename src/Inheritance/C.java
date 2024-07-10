package Inheritance;

public class C extends B{
    String companyName;
    C(){
        System.out.println("C's Constructor");
    }

    C(String name){
        System.out.println("C's Constructor with 1 parameter");
    }

    void fun(String s){
        System.out.println("Bye");
    }
}
