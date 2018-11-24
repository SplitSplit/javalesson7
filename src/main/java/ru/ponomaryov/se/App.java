package ru.ponomaryov.se;

/**
 * @author Oleg Ponomaryov
 * @version 1.0.0
 */
public class App {
    public static void main(String[] args) {
        AnimalType[] animals = new AnimalType[100];
        FoodPlate foodPlate = new FoodPlate();
        foodPlate.addFood(700.0D);

        for (int i = 0; i < 100; i++) {
            animals[i] = new AnimalCat("Cat " + (i + 1), 100.0D, 5.0D, 30.0D);
            animals[i].setDiet(7.0D + Math.round(Math.random() * 5.0D));
            //System.out.println("Create " + animals[i].getName() + " width diet:" + animals[i].getDiet());
        }

        System.out.println("Try to Cats eat");
        System.out.println("Food volume is " + foodPlate.getFoodVolume());

        for(int i=0; i<100; i++) {
            if(foodPlate.tryToEat(animals[i])) {
                System.out.println(animals[i].getName() + " eat " + animals[i].getDiet() + " successfully. Food volume is " + foodPlate.getFoodVolume());
            } else {
                System.out.println(animals[i].getName() + " eat " + animals[i].getDiet() + " unsuccessfully. Food volume is " + foodPlate.getFoodVolume());
            }
        }
    }
}
