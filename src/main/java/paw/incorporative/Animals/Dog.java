package paw.incorporative.Animals;

public class Dog extends Animal {
    private int amountOfCommands;

    public Dog(String name, int age) {
        super(name, age);
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }
}
