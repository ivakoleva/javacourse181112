package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.basics.Gender;

import java.util.Scanner;
import java.lang.String;
public class Chromosomes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String gender=s.next(),chrom="";
        Gender g ;
        if(gender.equals("male"))
        {
            g=Gender.MALE;
        }else if(gender.equals("female"))
        {
            g=Gender.FEMALE;
        }
        else
        {
            g=Gender.OTHER;
        }
        switch (g)
        {
            case MALE:
                System.out.println(g+" XY");
                break;
            case FEMALE:
                System.out.println(g+" XX");
                break;
            default:
                System.out.println(g);
        }
       /*int l=0;
        switch(gender.toLowerCase()){
            case "male":
                chrom+="Y";
            case "female":
                if(chrom.length()=="".length()) {
                    chrom+="X";
                }
            default:
                if(chrom.length()!="".length()){
                    chrom+="X";
                    System.out.println(chrom);
                }
                else{
                    System.out.println("Error");
                }
        }
        switch(gender.toLowerCase()){
            case "male":
                System.out.println("YX");
                break;
            case "female":
                    System.out.println("XX");
                    break;
            default:
                System.out.println("Error");
                break;
        }
        char ch1='X',ch2='E';
        switch (gender.toLowerCase())
        {
            case "male":
                ch2=(char)((int)ch1+1);
                break;
            case "female":
                ch2=ch1;
                break;
            default:
                break;
        }
        if(ch2!='E')
        {
            System.out.println(ch1+""+ch2);
        }
        else
        {
            System.out.println("ERROR");
        }*/
    }
}
