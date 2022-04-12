package ru.geekbrains.oop7_homework;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food amount increased by %d pts. There is now %d pts\n",
                           amount, this.foodAmount);
    }

    public int decreaseFood(int amount) {
        if(amount <= this.foodAmount) {
            this.foodAmount -= amount;
            return amount;
        }else {
            int foodLeft = this.foodAmount;
            this.foodAmount -= foodLeft;
            return foodLeft;
        }
    }

    public int getInfo() {
        return foodAmount;
    }
}


// по ТЗ
//public class Bowl {
//    private int foodAmount;
//
//    public void putFood(int amount) {
//        this.foodAmount += amount;
//        System.out.printf("Food amount increased by %d pts. There is now %d pts\n",
//                amount, this.foodAmount);
//    }
//
//    public boolean decreaseFood(int amount) {
//        if(amount <= this.foodAmount) {
//            this.foodAmount -= amount;
//            return true;
//        }
//        return false;
//    }
//
//    public int getInfo() {
//        return foodAmount;
//    }
//}
