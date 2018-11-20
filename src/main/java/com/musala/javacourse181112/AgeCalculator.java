package com.musala.javacourse181112;

public class AgeCalculator {
    public static void main(String[] args) {
        int ageAfter = 0;
       int i = args.length;
       i--;

       do{
          ageAfter += Integer.parseInt(args[i]);
          i--;
      }while(i != -1);

        System.out.println(ageAfter);
        System.exit( 0);

    }
}
