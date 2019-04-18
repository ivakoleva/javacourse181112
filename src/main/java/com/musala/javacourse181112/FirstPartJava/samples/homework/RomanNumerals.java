package com.musala.javacourse181112.FirstPartJava.samples.homework;

import java.util.Scanner;
    /**
     *ReadOnlyCollection() allows user input and tests 1-3999
     *toRoman() breaks the number down into digits and passes them to romanLogic()
     *romanLogic() converts each digit into a the numerals that represent it.
     */
    public class RomanNumerals
    {
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.print("give us an integer < 4000: ");        
            System.out.println("the roman numeral version is: " + toRoman(in.nextInt()));
            /*for (int i = 1; i<=3999; i++){
                System.out.println(i +" === "+ toRoman(i));
            }*/
        }
        public static String toRoman(int i){
            String output = "";
            int digits = i%10;
            int tens = (i%100)/10;
            int hundreds = (i%1000)/100;
            int thousands = (i%10000)/1000;
            return (romanLogic(thousands, "M","","")+
                    romanLogic(hundreds,"C","D","M")+
                    romanLogic(tens,"X","L","C")+
                    romanLogic(digits,"I","V","X"));
        }
	    public static String romanLogic(int i, String ones, String fives, String tens){
		    String result = "";
		    if (i == 0){
			    return result;
		    } else {
			    if ((i>=4)&&(i<=8)){
				    result += fives;
			    }
			    if (i==9){
				    result += tens;
			    }
			    if(i%5 < 4){
				    while(i%5 > 0){
					    result += ones;
					    i--;
				    }
			    }
			    if(i%5 == 4){
				    result = ones + result;
			    }
		    }
		    return result;
	    }
    }
