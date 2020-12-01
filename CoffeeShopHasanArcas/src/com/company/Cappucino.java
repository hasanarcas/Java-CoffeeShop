package com.company;

public class Cappucino extends CaffeineBeverage {
    public Cappucino(boolean withMilk, int size) {
        hasMilk = withMilk;
        this.size = size;
        name = "Cappucino";
    }
    @Override
    public void cost(){
        if(size==Beverage.SMALL){
            cost= 6;
        }
        else if(size==Beverage.MEDIUM){
            cost= 7;
        }
        else if(size==Beverage.LARGE){
            cost= 8;
        }
        if(hasMilk){
            cost += 1;
        }
    }

}
