package ru.ponomaryov.se;

public class AnimalType {
    protected double runRange;
    protected double jumpRange;
    protected double swimRange;
    protected boolean satiety;
    protected double diet;

    public AnimalType() {
        runRange = 0.0D;
        jumpRange = 0.0D;
        swimRange = 0.0D;
        satiety = false;
        diet = 10.0D;
    }

    public boolean doRun(double range) {
        return range < this.runRange ? true : false;
    }

    public boolean doJump(double height) {
        return height < jumpRange ? true : false;
    }

    public boolean doSwim(double range) {
        return range < swimRange ? true : false;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public double getDiet() {
        return diet;
    }

    public void setDiet(double diet) {
        if (diet > 0.0D) {
            this.diet = diet;
        } else {
            this.diet = 0.0D;
        }

    }


    public String getName() {
        return "";
    }
}
