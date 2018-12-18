package com.musala.javacourse181112.basics.task;

import java.util.LinkedList;
import java.util.List;

public class ClassChild {
    public static void main(String[] args) {
        List<?> stupidList = new LinkedList<>();
        bridgeFunc(stupidList);



    }
    static void bridgeFunc(List<? super Object> stupidList) {
        stupidList.add ((new Object()));

    }
}
