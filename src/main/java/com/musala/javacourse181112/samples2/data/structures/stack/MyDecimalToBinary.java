package com.musala.javacourse181112.samples2.data.structures.stack;

public class MyDecimalToBinary {
 
    public static String convertDecimalToBinary(int number){
         
        StringBuilder binary = new StringBuilder();
        MyDynamicStack2 stack = new MyDynamicStack2(10);
        if(number == 0){
            binary.append("0");
        } else {
            while(number != 0){
                stack.push(number%2);
                number = number/2;
            }
        }
        while(!stack.isStackEmpty()){
            try {
                binary.append(stack.pop());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return binary.toString();
    }
     
    public static void main(String a[]){
        System.out.println("Binary value of 2 is: "+ convertDecimalToBinary(2));
        System.out.println("Binary value of 15 is: "+ convertDecimalToBinary(15));
        System.out.println("Binary value of 23 is: "+ convertDecimalToBinary(23));
    }
}
 
 
class MyDynamicStack2 {
 
    private int stackSize;
    private int[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public MyDynamicStack2(int size) {
        this.stackSize = size;
        this.stackArr = new int[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top 
     * of the stack
     * @param entry
     * @throws Exception 
     */
    public void push(int entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 
    /**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
    public int pop() throws Exception {
        if(this.isStackEmpty()){
            throw new Exception("Stack is empty. Can not remove element.");
        }
        int entry = this.stackArr[top--];
        //System.out.println("Removed entry: "+entry);
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public long peek() {
        return stackArr[top];
    }
 
    private void increaseStackCapacity(){
         
        int[] newStack = new int[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    /**
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    /**
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
 
    public static void main(String[] args) {
        MyDynamicStack2 stack = new MyDynamicStack2(2);
        for(int i=1;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
