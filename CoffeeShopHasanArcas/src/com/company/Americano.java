package com.company;

public class Americano extends CaffeineBeverage {
    public Americano(boolean withMilk, int size) {
        hasMilk = withMilk;
        this.size = size;
        name = "Americano";
    }
    @Override
    public void cost(){
        if(size==Beverage.SMALL){
            cost= 7;
        }
        else if(size==Beverage.MEDIUM){
            cost= 8;
        }
        else if(size==Beverage.LARGE){
            cost= 9;
        }
        if(hasMilk){
            cost += 1;
        }
    }

}
