package com.musala.javacourse181112.tasks.innerexercise;

public class StaticNestedClass {
    private static CatsEnum staticValue = CatsEnum.MEOW;

    private String nonStaticValue = "I am a nonStaticClass nonstatic value.";

    public static void main(String[] args) {
        final StaticNestedClass.StaticCatClass staticClass = new StaticNestedClass.StaticCatClass();
        staticClass.catSounds();


    }
    public static class StaticCatClass{
        private static String staticValue = "I am a CatClass nested in a StaticNestedClass.";

        public void catSounds() {
            System.out.println(staticValue);
            System.out.println(StaticNestedClass.staticValue);
        }

    }
    public interface InnerCatInterface {
        void catSounds();
    }
    public enum CatsEnum {
        MEOW,
        PURR,
        HISS
    }
}
