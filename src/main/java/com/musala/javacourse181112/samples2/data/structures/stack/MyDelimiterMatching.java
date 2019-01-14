package com.musala.javacourse181112.samples2.data.structures.stack;

public class MyDelimiterMatching {
 
    public static void main(String a[]){
        MyDelimiterMatching mdm = new MyDelimiterMatching();
        String expression = "{(a+b)*(c+d)}";
        boolean result = mdm.isDelimiterMatching(expression);
        System.out.println(expression +" == "+result);
         
        expression = "{(a+b)+[x*(c+d)]}";
        result = mdm.isDelimiterMatching(expression);
        System.out.println(expression +" == "+result);
         
        expression = "{(a+b)+[x*(c+d)}}";
        result = mdm.isDelimiterMatching(expression);
        System.out.println(expression +" == "+result);
    }
 
    public boolean isDelimiterMatching(String inputExpr) {
         
        int stackSize = inputExpr.length();
        StackImpl2 theStack = new StackImpl2(stackSize);
        for (int j = 0; j < inputExpr.length(); j++) {
            char ch = inputExpr.charAt(j);
            switch (ch) {
            case '{':
            case '[':
            case '(':
                    theStack.push(ch);
                    break;
            case '}':
            case ']':
            case ')':
                    if (!theStack.isStackEmpty()) {
                        char stackContent = theStack.pop();
                        if ((ch == '}' && stackContent != '{') 
                                || (ch == ']' && stackContent != '[')
                                || (ch == ')' && stackContent != '(')){
                            System.out.println("Mismatch found: " + ch + " at " + j);
                            return false;
                        }
                    } else {
                        System.out.println("Mismatch found: " + ch + " at " + j);
                        return false;
                    }
                    break;
            default: break;
            }
        }
        if (!theStack.isStackEmpty()){
            System.out.println("Error: missing right delimiter");
            return false;
        }
        return true;
    }
}
 
 
class StackImpl2 {
 
    private int stackSize;
    private char[] stackArr;
    private int top;
 
    /**
     * constructor to create stack with size
     * @param size
     */
    public StackImpl2(int size) {
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