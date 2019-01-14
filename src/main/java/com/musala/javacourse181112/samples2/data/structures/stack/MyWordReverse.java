package com.musala.javacourse181112.samples2.data.structures.stack;

public class MyWordReverse {
 
    public String reverseWord(String word){
         
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        StackImpl2 stack = new StackImpl2(size);
        for(int i=0;i<size;i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isStackEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
     
    public static void main(String a[]){
        MyWordReverse mwr = new MyWordReverse();
        System.out.println("Musala Course == "+mwr.reverseWord("Musala Course"));
        System.out.println("Java == "+mwr.reverseWord("Java"));
        System.out.println("program == "+mwr.reverseWord("program"));
    }
}
 
class StackImpl {
 
    private int stackSize;
    private char[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public StackImpl(int size) {
        this.stackSize = size;
        this.stackArr = new char[stackSize];
        this.top = -1;
    }
 
    /**
     * This method adds new entry to the top 
     * of the stack
     * @param entry
     * @throws Exception 
     */
    public void push(char entry) {
        this.stackArr[++top] = entry;
    }
 
    /**
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception 
     */
    public char pop() {
        char entry = this.stackArr[top--];
        return entry;
    }
     
    /**
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public char peek() {
        return stackArr[top];
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
}