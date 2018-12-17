package com.musala.javacourse181112.tasks;

import java.io.ObjectInput;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class GenericsTriDimensionalMatrixExercise {
    public static void main(final String[] args) {
        final int[][][] intArray =
                {
                        {
                                {1, 2, 3},
                                {1, 2, 3}
                        }
                };

        // TODO: using List, applying generics
        List<Object> triDemenIntegerArray=listMaker(3,3);
    }
    public static List<Object> listMaker(int n,int n_n){
        if(n==1){
            List<Object> l=new ArrayList<>();
            for(int i=0;i<n_n;i++){
                l.add(i);
            }
            return l;
        }
        List<Object> l=new ArrayList<>();
        for(int i=0;i<n_n;i++){
            l.add(listMaker(n-1,n_n));
        }
        return l;
    }
}
