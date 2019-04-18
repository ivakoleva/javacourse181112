package com.musala.javacourse181112.FirstPartJava.tasks.test1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Solution {


    public static final String MULTIPLE_OF_2 = "multipleOf_2";
    public static final String MULTIPLE_OF_11 = "multipleOf_11";
    public static final String MULTIPLE_OF_2_11 = "multipleOf_2_11";

    // Complete the replaceNumbers function below.
        static List<String> replaceNumbers() {

            List<String> result = new ArrayList<>();
            int i;
                for(i=0;i<=100;i++) {
                    if (isMultipleBy(i, 2) && isMultipleBy(i, 11)) {
                        result.add(MULTIPLE_OF_2_11);
                        continue;
                    }
                    if (isMultipleBy(i, 2)) {
                        result.add(MULTIPLE_OF_2);
                        continue;
                    }

                    if (isMultipleBy(i, 11)) {
                        result.add(MULTIPLE_OF_11);
                        continue;
                    }
                        result.add(""+i );
                }
                return result;
        }

    private static boolean isMultipleBy(Integer i, int i2) {
        return i % i2 == 0;
    }

    public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            List<String> res = replaceNumbers();

            bufferedWriter.write(
                    res.stream()
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedWriter.close();
        }
    }
