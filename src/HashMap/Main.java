package HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap hm = new HashMapImplementation();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(12, "c");
        hm.put(22, "d");

        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        System.out.println(hm.get(12));
        System.out.println(hm.get(22));

        hm.print();

    }
}
