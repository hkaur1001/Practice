package Heap;

public class Main {

    public static void main(String[] args) {

        Heap h = new MaxHeapImplementation();
        h.insertNode(2);
        h.insertNode(3);
        h.insertNode(4);
        h.insertNode(1);
        h.insertNode(6);

        h.print();
        System.out.println("Max element: "+h.getMax());

        h.deleteMax();
        h.print();

    }

}
