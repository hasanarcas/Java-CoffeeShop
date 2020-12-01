package com.company;

public class Latte extends CaffeineBeverage {
    public Latte(boolean withMilk, int size) {
        hasMilk = withMilk;
        this.size = size;
        name = "Latte";
    }
    @Override
    public void cost(){
        if(size==Beverage.SMALL){
            cost= 5;
        }
        else if(size==Beverage.MEDIUM){
            cost= 6;
        }
        else if(size==Beverage.LARGE){
            cost= 7;
        }
        if(hasMilk){
            cost += 1;
        }
    }

}
