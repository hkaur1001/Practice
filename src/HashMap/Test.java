package HashMap;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>(6);
        l.add("Hi");
        l.add("Hello");
        l.add("bye");

        System.out.println(l);
        System.out.println(l.get(0));
        System.out.println(l.get(3));

    }
}
