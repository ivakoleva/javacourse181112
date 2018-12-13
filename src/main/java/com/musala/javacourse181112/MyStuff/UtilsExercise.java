package com.musala.javacourse181112.MyStuff;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UtilsExercise {
    public static void main(String[] args)  {
   /*     Collection<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Shark");
        animals.add("Turtle");
*/
   List<Integer> numbers = new ArrayList<>(IntStream.range(1,11)
           .boxed()
           .collect(Collectors.toList()));

   System.out.println(numbers);

   Collections.shuffle(numbers);
   System.out.println(numbers);

   Collections.sort(numbers);
   System.out.println(numbers);

   Collections.reverse(numbers);
   System.out.println(numbers);

   int i;
   List<String> cat = new ArrayList<>();
   for(i = 0; i<100; i++){
   cat.add("cat");
   }
   System.out.println(cat);

   List<Object> mix = new ArrayList<>();
   mix.addAll(numbers);
   mix.addAll(cat);

   System.out.println(mix);

    }
}


