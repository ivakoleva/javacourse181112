package com.musala.javacourse181112.tasks.innerexercise;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Iva Koleva on 08.01.2019
 */
public class Innerclass {
    private String StringValue = "Give me the money";

    public String getStringValue() {
        return StringValue;
    }

    public static void main(final String[] args) {
        final Innerclass innerClassSample = new Innerclass();

        final Innerclass.NewInnerClass innerClass =
                innerClassSample.new NewInnerClass();
        innerClass.printStringValue();

        final Innerclass.NewInnerClass innerClass1 =
                innerClassSample.new NewInnerClass();
        final Map<Integer, String> map = new HashMap<>();

        for(final Map.Entry<Integer, String> entry : map.entrySet() ) {
        }
    }

    public class NewInnerClass {
        private String StringValue = "Give me rest of the money";

        public void printStringValue() {
            System.out.println(StringValue);
        }
    }


    public static interface InnerInterface {
    }

    public static enum InnerEnum {
    }
}
