package com.musala.javacourse181112.tasks;

/**
 * Created by Iva Koleva on 08.01.2019
 */
public class CompositionAndInheritanceExercise {
    public static void main(final String[] args) {
//        final Human human1 = new Human();
        //TODO: set alive
        //TODO: final Human human2 = human1.giveBirth();
    }

    interface Being {
        boolean isAlive(); //boolean getter
    }

    abstract class Mammal implements Being {
        private String kind;
        protected int birthsCount;

        public String getName() {
            return kind;
        }

        public void setName(String name) {
            this.kind = name;
        }

        @Override
        public boolean isAlive() {
            return true;
        }

        Mammal giveBirth() {
            return new Mammal() {
                @Override
                public String getName() {
                    return super.getName();
                }

                @Override
                public void setName(String name) {
                    super.setName(name);
                }

                @Override
                public boolean isAlive() {
                    return super.isAlive();
                }

                @Override
                Mammal giveBirth() {
                    return super.giveBirth();
                }
            };


        }

        // TODO: implement
        class Human extends Mammal {
            private String name;
            private String sex;

            @Override
            public String getName() {
                return name;
            }

            @Override
            public void setName(String name) {
                this.name = name;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            @Override
            public boolean isAlive() {
                return true;
            }

            Mammal giveBirth(int birthsGiven) {
                return new Human();
            }
        }
    }
}
