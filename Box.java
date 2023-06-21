package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box <F extends Fruit> {

    private final ArrayList<F> fruits;

    private double weight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
        weight += weight;

    }

//
//    private <F> fruitWeight(F fruit) {
//        if (fruit instanceof Apple) {
//            return new Apple();
//        } else if (fruit instanceof Orange)
//            return new Orange();
//        return null;
//    }


    public float getWeight() {
        float totalWeightBox = 0.0f;
        for (Fruit fruit : fruits) {
            totalWeightBox += fruit.weight;
        }
        return totalWeightBox;

    }


    public boolean compare(Box<?> box) {
        return Double.compare(this.getWeight(), box.getWeight()) == 0;

    }

    public float shift(Box<F> box) {
        for (F fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
        weight = 0;

        return 0;
    }
}
