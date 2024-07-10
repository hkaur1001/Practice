package Inheritance;

public class TestDrive {

    public static void main(String[] args) {

        //Instructor in = new Instructor();
        //when we are calling the cons of instructor class , somehow at=utomatically the cons of User class is also getting called
        //in.email = "abc@xyz.com";
        //System.out.println(in.companyName);
        //System.out.println(in.avgRating);

        D d = new D();
        d.fun("");

        A a = new A();
        a.fun("Hello");

        A a1 = new C();
        a1.fun("");






    }



}
