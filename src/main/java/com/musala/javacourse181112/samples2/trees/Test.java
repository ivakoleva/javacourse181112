package com.musala.javacourse181112.samples2.trees;

class Exc0 extends Exception { }
class Exc1 extends Exc0 { } /* Line 2 */
public class Test 
{  
    public static void main(String args[]) 
    { 
        try 
        {  
            throw new Exc1(); /* Line 9 */
        } 
        catch (Exc0 e0) /* Line 11 */
        {
            System.out.println("Ex0 caught"); 
        } 
        catch (Exception e) 
        {
            System.out.println("exception caught");  
        } 
    } 
}