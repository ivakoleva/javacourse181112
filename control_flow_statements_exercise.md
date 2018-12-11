**Questions**

1. The most basic control flow statement supported by the Java programming language is the if statement.
2. The switch statement allows for any number of possible execution paths.
3. The do while statement is similar to the while statement, but evaluates its expression at the bottom of the loop.
4. How do you write an infinite loop using the for statement?
for( ; ;){
System.out.println(1);
}
5. How do you write an infinite loop using the while statement?
while(true){
System.out.println(1);
}
**Exercises**

1. Consider the following code snippet.

`if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");`

a) What output do you think the code will produce if aNumber is 3? second string third string
b) Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
c) Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
d) Use braces, { and }, to further clarify the code.

public class Test{

 public static void main(String[] args){
  int aNumber = 3;
` if (aNumber >= 0){
    if (aNumber == 0){
        System.out.println("first string");
    }else{
     System.out.println("second string");
     }
  System.out.println("third string");`
  }
 }
}