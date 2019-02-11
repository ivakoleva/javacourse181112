package paw.incorporative.Animals;

public class Cat extends Animal {
    private int intelligrenceCoefficient;

    public Cat(String name, int age) {
        super(name, age);
    }

    public int getIntelligrenceCoefficient() {
        return intelligrenceCoefficient;
    }

    public void setIntelligrenceCoefficient(int intelligrenceCoefficient) {
        this.intelligrenceCoefficient = intelligrenceCoefficient;
    }
}
