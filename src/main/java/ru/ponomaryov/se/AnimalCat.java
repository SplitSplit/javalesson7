package ru.ponomaryov.se;

public class AnimalCat extends AnimalType {
    public String name;

    public AnimalCat(String name, double runRange, double jumpRange, double swimRange) {
        super();
        super.runRange = runRange;
        super.jumpRange = jumpRange;
        super.swimRange = swimRange;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
