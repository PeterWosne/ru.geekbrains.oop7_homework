package ru.geekbrains.oop7_homework;

public class Cat {
    private String name;
    private int appetite;
    private boolean well_fed;
    private int foodEaten;
    private int foodRequired;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        foodEaten = bowl.decreaseFood(appetite);
        if(foodEaten == appetite) {well_fed = true;}else {foodRequired = appetite - foodEaten;}
    }

    public String getName() {return name;}
    public boolean getInfo() {
        return well_fed;
    }
    public int getInfoFoodEaten() {return foodEaten;}
    public int getInfoFoodRequired() {return foodRequired;}
    public int getAppetite() {return appetite;}
}


// по ТЗ
//public class Cat {
//    private String name;
//    private int appetite;
//    private boolean well_fed;
//
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
//    }
//
//    public void eat(Bowl bowl) {
//        well_fed = bowl.decreaseFood(appetite);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean getInfo() {
//        return well_fed;
//    }
//}
