package com.musala.javacourse181112.tasks.innerxercise;

public class LocalAndAnonymousClass {
    public static void main(String[] args) {
        InnerClassExample outer = new InnerClassExample();
        outer.innerClass= outer.new InnerClass("pewaaew");

        class LocalClass{
            public String name;


            void startThread(){
                Thread thread = new Thread(runnable);
                thread.start();
            }
            public LocalClass(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {


                this.name = name;
            }

            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Dont forget to close resources and start threads in next exam!!!");
                }
            };
        }

    }
}
