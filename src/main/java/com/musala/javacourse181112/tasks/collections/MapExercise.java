package com.musala.javacourse181112.tasks.collections;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExercise {
    public static void main(final String[] args) {
        final Map<Integer, String> employeesMap = IntStream.range(0, 15).boxed()
                .collect(Collectors.toMap(
                        i -> i + 1,
                        i -> "Employer" + (i + 1)));
        employeesMap.put(16, "Employer16");
        employeesMap.put(17, "Employer17");

        //System.out.println("Is the map is empty: " + employeesMap.isEmpty());

        System.out.println("The map is: ");
        for (Map.Entry<Integer, String> entry : employeesMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("key");
        for (Integer key : employeesMap.keySet()){
            System.out.println(key);
        }

        System.out.println("values");
        for (String value : employeesMap.values()){
            System.out.println(value);
        }
        /*System.out.println("The size of the map is: " + employeesMap.size());

        System.out.println("Does the map contain key = 3: " + employeesMap.containsKey(3));

        System.out.println("Does the map contain Employer3: " + employeesMap.containsValue("Employer3"));

        employeesMap.remove(2);

        employeesMap.replace(1, "EMPLOYER1");

        System.out.println("Map after processing:");
        for (Map.Entry<Integer, String> entry : employeesMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/
    }
}
