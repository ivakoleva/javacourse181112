package com.musala.javacourse181112.oop;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class InnerClassSample {
    private String nonStaticValue = "asd";

    public String getNonStaticValue() {
        return nonStaticValue;
    }

    public static void main(final String[] args) {
        final InnerClassSample innerClassSample = new InnerClassSample();

        final InnerClassSample.InnerClass innerClass =
                innerClassSample.new InnerClass();
        innerClass.printValuesToStdout();
        //new InnerClassSample().new InnerClass();

        final InnerClassSample.InnerClass innerClass1 =
                innerClassSample.new InnerClass();

        final Map<Integer, String> map = new HashMap<>();
        // Entry is inner interface of Map interface
        for(final Map.Entry<Integer, String> entry : map.entrySet() ) {
        }
    }

    public class InnerClass {
        private String nonStaticValue = "asd1";

        public void printValuesToStdout() {
            System.out.println(nonStaticValue); // shadowing outer class value
            // could bridge and call outer class getter instead
        }
    }

    // inner interface & enum are always static
    // static keyword marked as redundant
    public static interface InnerInterface {
    }
    public static enum InnerEnum {
    }
}

// inner class needs to be static nested in order to be extended outside outer class
/*class Test extends InnerClassSample.InnerClass {
}*/