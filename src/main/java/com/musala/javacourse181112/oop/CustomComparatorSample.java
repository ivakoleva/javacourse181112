package com.musala.javacourse181112.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public class CustomComparatorSample {
    public static void main(final String[] args) {
        final List<CustomClass> customClassList = new ArrayList<>();
        customClassList.add(new CustomClass(10));
        customClassList.add(new CustomClass(9));
        /*Collections.sort(customClassList, new Comparator<CustomClass>() {
            @Override
            public int compare(CustomClass o1, CustomClass o2) {
                return o1.integerField.compareTo(o2.integerField);
            }
        });*/
        Collections.sort(customClassList, Comparator.comparing(o -> o.integerField));
        System.out.println();
    }
}

class CustomClass1 {
    public Integer integerField;
    public int intField;

    public CustomClass1(final Integer field) {
        integerField = field;
        intField = field;
    }
    class DateTimeOfPayment{
        private Number date;
        public void setDate(Number date){this.date=date;}

        public Number getDate() {
            return date;
        }
    }
final class  Utils {

private Utils(){

}

}
}