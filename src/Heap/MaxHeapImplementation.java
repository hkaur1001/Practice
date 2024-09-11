package Heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeapImplementation implements Heap{

    List<Integer> maxHeap = new ArrayList<>();
    @Override
    public void insertNode(Integer value) {
        maxHeap.add(value);
        heapifyUp(maxHeap.size()-1);
    }

    private void heapifyUp(int index){

        int parentIndex = (index-1)/2;
        if(maxHeap.size()!=1) {
            while (maxHeap.get(parentIndex) < maxHeap.get(index)) {

                Integer temp = maxHeap.get(index);
                maxHeap.set(index, maxHeap.get(parentIndex));
                maxHeap.set(parentIndex, temp);

                index = parentIndex;
                parentIndex = (index-1)/2;
            }
        }
    }

    @Override
    public Integer getMax() {
        return maxHeap.get(0);
    }

    @Override
    public void deleteMax() {
          maxHeap.set(0, maxHeap.get(maxHeap.size()-1));
          maxHeap.remove(maxHeap.size()-1);
          HeapifyDown(0);
    }


    private void HeapifyDown(int index) {
        int leftChild = (2*index)+1;
        int rightChild = (2*index)+2;

        while (maxHeap.get(index) < maxHeap.get(leftChild) || maxHeap.get(index) < maxHeap.get(rightChild)){
        if(maxHeap.get(leftChild) > maxHeap.get(rightChild)){
            //swap left child with parent
            int temp = maxHeap.get(index);
            maxHeap.set(index, maxHeap.get(leftChild));
            maxHeap.set(leftChild, temp);
            index = leftChild;
        }else{
            //swap right child with parent
            int temp = maxHeap.get(index);
            maxHeap.set(index, maxHeap.get(rightChild));
            maxHeap.set(rightChild, temp);
            index = rightChild;
           }

            leftChild = (2*index)+1;
            rightChild = (2*index)+2;
            if(leftChild>=maxHeap.size() || rightChild>=maxHeap.size())
                break;
        }
    }

    @Override
    public void print() {
        for(Integer list : maxHeap){
            System.out.print(list+"->");
        }
        System.out.println();
    }


}
