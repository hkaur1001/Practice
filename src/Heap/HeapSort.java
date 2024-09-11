package Heap;

public class HeapSort {

    public static int[] sort(int[] inputArray){
        int[] sortedArray = new int[inputArray.length];

        Heap h = new MaxHeapImplementation();
        for(int value: inputArray){
            h.insertNode(value);
        }

        for(int i=0; i<inputArray.length; i++){
            sortedArray[i] = h.getMax();
            h.deleteMax();
        }

        return sortedArray;
    }
    public static void main(String[] args) {

        int inputArray[] = {5, 1, 7, 8, 9, 4};
        for(int val: inputArray){
            System.out.print(val+ " ");
        }
        int[] sortedArray = sort(inputArray);
        for(int val: sortedArray){
            System.out.print(val+ " ");
        }

    }

}
