package com.musala.javacourse181112.tasks;

import java.lang.reflect.Constructor;

public class ReflectionExercise {
    private static class SampleClass {
        private SampleClass(){
        }

        private String name;
        private int id;
        private FamilyPostion familyPostion;
        private int age;

        public SampleClass(int id, String name)
        {
            this.name = name;
            this.id = id;
        }
        public SampleClass(FamilyPostion familyPostion, int age)
        {
            this.familyPostion = familyPostion;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public FamilyPostion getFamilyPostion() {
            return familyPostion;
        }

        public void setFamilyPostion(FamilyPostion familyPostion) {
            this.familyPostion = familyPostion;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "SampleClass{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    ", familyPostion=" + familyPostion +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) throws Exception{
        String name = "Ivan";
        int id = 1234567890;
        int age = 25;
        FamilyPostion  familyPostion = FamilyPostion.MARRIED;

        Class<SampleClass> samplePerson = SampleClass.class;

        SampleClass sampleClass1 = samplePerson
                .getDeclaredConstructor(int.class,String.class)
                .newInstance(id,name);

        SampleClass sampleClass2 = samplePerson
                .getDeclaredConstructor(FamilyPostion.class,int.class)
                .newInstance(familyPostion,age);
        sampleClass2.setId(sampleClass1.getId());
        sampleClass2.setName(sampleClass1.getName());
        System.out.println(sampleClass2);

    }

    enum FamilyPostion{
        MARRIED,
        NOT_MARRIED
    }
}
