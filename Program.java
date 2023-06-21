package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
//        ArrayList<Float> fruits = new ArrayList<>();
//        fruits.add(0, 1.5f);
//        fruits.add(1, 1.0f);
//        fruits.add(2, 1.0f);
//        fruits.add(3, 1.5f);
//        fruits.add(4, 1.0f);
//        fruits.add(5, 1.0f);
//
//
//
//
//
//
//
//        System.out.println(fruits.get(0));
//
//        ArrayList<Float> appleBox = new ArrayList<>();
//         appleBox.add(0,1.0f);
//        appleBox.add(1,1.0f);
//        appleBox.add(2,1.0f);
//        appleBox.add(3,1.0f);
//        appleBox.add(4,1.0f);
//        appleBox.add(5,1.0f);
//        appleBox.add(6,1.0f);
//        appleBox.add(7,1.0f);
//
//
////       Box box1 = new Box(appleBox);
//
//
//
//
//        ArrayList<Float> orangeBox = new ArrayList<>();
//        orangeBox.add(0,1.5f);
//        orangeBox.add(1,1.5f);
//        orangeBox.add(2,1.5f);
//        orangeBox.add(3,1.5f);
//        orangeBox.add(4,1.5f);
//        orangeBox.add(5,1.5f);
//        orangeBox.add(6,1.5f);
//        orangeBox.add(7,1.5f);

//        Box box2 = new Box(orangeBox);
//


//
//        Box<Apple> box = new Box<>(ArrayList<Fruit> fruits, ArrayList<Float> orangeBox, 14.0f);
//        box.execute();
//        box.execute();
        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());
        box2.addFruit(new Orange());


        Box<Orange> box3 = new Box<>();
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());

        System.out.printf("Вес коробки c яблоками равен %s\n", box1.getWeight());
        System.out.printf("Вес коробки c апельсинами равен %s\n", box2.getWeight());
        System.out.printf("Вес коробки c апельсинами равен %s\n", box3.getWeight());

        System.out.println("Состояние равенства первой и второй коробки:");
        System.out.println(box1.compare(box2));

        System.out.printf("Пересыпаем апельсины к апельсинам\n", box2.shift(box3));


        System.out.printf("Вес коробки c апельсинами равен %s\n", box2.getWeight());
        System.out.printf("Вес коробки c апельсинами равен %s\n", box3.getWeight());


    }

}
