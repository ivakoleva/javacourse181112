package com.musala.javacourse181112.tasks;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
        v1(args);
        v2(args);
    }
    public static void v1(final String[] args){
        int i=0;
        while((i+1)<args.length) {
            if(!Integer.toString(Integer.parseInt(args[i])).equals(args[i])||!Integer.toString(Integer.parseInt(args[i+1])).equals(args[i+1]))
            {
                System.out.println(1);
                //System.exit(1);
            }
            parser(args,i);
            i+=2;
        }
    }
    public static void v2(final String[] args)
    {
        int k=0;
        while(k<args.length){
            for(int i=0;i<args[k].length();i++){
                if(args[k].charAt(i)<'0'||args[k].charAt(i)>'9')
                {
                    System.out.println(1);
                    //System.exit(1);
                }
            }
            if(k%2!=0){
                parser(args,k-1);
            }
            k+=1;
        }
    }
    public static void parser(final String[] args,int i){
        int age=Integer.parseInt(args[i]);
        int addYears = Integer.parseInt(args[i+1]);

        System.out.println("Age:" + age + "\nAdded Age:" + addYears);
        System.out.println("Result:" + (age + addYears));
    }
}
