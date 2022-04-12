package ru.geekbrains.oop7_homework;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //решил сделать что кот может съесть корм из миски, даже если ему не хватает, ну кто ж откажется, но кот все равно будет недоволен
        // по ТЗ тоже сделал
        Bowl bowl = new Bowl();
        bowl.putFood(600);

        Cat cat_1 = new Cat("Kuzya", 200);
        Cat cat_2 = new Cat("Tom", 200);
        Cat cat_3 = new Cat("Plyushka", 130);
        Cat cat_4 = new Cat("Destroyer", 130);
        Cat cat_5 = new Cat("Grizzlyk", 90);

        ArrayList<Cat> list = new ArrayList<>();
        Collections.addAll(list, cat_1, cat_2, cat_3, cat_4, cat_5);

        int total = 0;
        for(Cat cat : list) {
            cat.eat(bowl);
            System.out.printf("Cat %s got enough food: %b (%d/%d)\n",
                    cat.getName(), cat.getInfo(), cat.getInfoFoodEaten(),cat.getAppetite());
            if(!cat.getInfo()) total += cat.getInfoFoodRequired();
        }
        System.out.printf("Please put another %d food for hungry cats\n",total);
    }
}

//это по ТЗ: кот не может взять еду из миски если не хватает
//public class Main {
//
//    public static void main(String[] args) {
//        Bowl bowl = new Bowl();
//        bowl.putFood(500);
//        System.out.println(bowl.getInfo());
//
//        Cat cat_1 = new Cat("Kuzya", 150);
//        Cat cat_2 = new Cat("Tom", 130);
//        Cat cat_3 = new Cat("Plyushka", 130);
//        Cat cat_4 = new Cat("Destroyer", 130);
//
//        ArrayList<Cat> list = new ArrayList<>();
//        Collections.addAll(list, cat_1, cat_2, cat_3, cat_4);
//        for(Cat cat : list) {
//            cat.eat(bowl);
//            System.out.printf("Cat %s got enough food: %b\n", cat.getName(), cat.getInfo());
//        }
//        System.out.printf("Food left in bowl: %d", bowl.getInfo());
//    }
//}


