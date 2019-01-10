package com.musala.javacourse181112.tasks.votesexercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VoteRunner {
     static final int MAX_NAME_LENGHT = 10;
     private static final int MAX_NUMBER_PEOPLE = 2;
     static int voteYes = 0;
     static int voteNo = 0;
     static final Scanner SCN = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        int numberPoeople;
        Random generator = new Random();


        numberPoeople = generator.nextInt(MAX_NUMBER_PEOPLE)+1;
        System.out.println(numberPoeople + " people have voted:\n");

        for (int i = 0; i < numberPoeople; i++) {
            Person person = new Person();
            person.setName(VoteUtills.firstNameFun(generator) +"  "+ VoteUtills.lastNameFun(generator));
            person.setIdNumber(VoteUtills.idNum(generator));
            VoteUtills.votGen(person);

            System.out.println("Name:" +person.getName()+"\n"+
                    "ID number:"+ Arrays.toString(person.getIdNumber()) +"\n"+
                    "Question 1 vote: "+person.getVoteQuestion1()+"\n"+
                    "Question 2 vote:" + person.getVoteQuestion2());
        }
        System.out.println("The number of 'NO' votes is "+ voteNo +"\n");
        System.out.println("The number of 'YES' votes is "+ voteYes);

    }
}