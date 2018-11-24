package ru.ponomaryov.se;

public class FoodPlate {
    protected double foodVolume;

    public FoodPlate() {
        this.foodVolume = 0.0D;
    }

    public double getFoodVolume() {
        return foodVolume;
    }

    public void addFood(double volume) {
        if (volume >= 0.0D) {
            foodVolume += volume;
        }
    }

    public boolean tryToEat(AnimalType animal) {
        if (!animal.satiety) {
            if (foodVolume < animal.diet) {
                return false;
            } else {
                foodVolume -= animal.diet;
                animal.setSatiety(true);
                return true;
            }
        }
        return false;
    }
}
