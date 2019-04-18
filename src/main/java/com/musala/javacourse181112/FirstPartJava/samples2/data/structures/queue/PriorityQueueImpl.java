package com.musala.javacourse181112.FirstPartJava.samples2.data.structures.queue;
 
public class PriorityQueueImpl {
 
    @SuppressWarnings("rawtypes")
    private Comparable[] pQueue;
    private int index;
     
    public PriorityQueueImpl(int capacity){
        pQueue = new Comparable[capacity];
    }
     
    public void insert(Comparable item ){
        if(index == pQueue.length){
            System.out.println("The priority queue is full!! can not insert.");
            return;
        }
        pQueue[index] = item;
        index++;
        System.out.println("Adding element: "+item);
    }
     
    @SuppressWarnings("unchecked")
    public Comparable remove(){
        if(index == 0){
            System.out.println("The priority queue is empty!! can not remove.");
            return null;
        }
        int maxIndex = 0;
        // find the index of the item with the highest priority 
        for (int i=1; i<index; i++) { 
            if (pQueue[i].compareTo (pQueue[maxIndex]) > 0) { 
                maxIndex = i; 
            } 
        } 
        Comparable result = pQueue[maxIndex]; 
        System.out.println("removing: "+result);
        // move the last item into the empty slot 
        index--; 
        pQueue[maxIndex] = pQueue[index]; 
        return result;
    }
     
    public static void main(String a[]){
        PriorityQueueImpl pqi = new PriorityQueueImpl(5);
        pqi.insert(34);
        pqi.insert(23);
        pqi.insert(5);
        pqi.insert(87);
        pqi.insert(32);
        pqi.remove();
        pqi.remove();
        pqi.remove();
        pqi.remove();
        pqi.remove();
    }
}