package com.company;

public class GreenTea extends TeaBeverage {
    public GreenTea(boolean withLemon, int size) {
        hasLemon = withLemon;
        this.size = size;
        name = "Green Tea";
    }
    @Override
    public void cost(){
        if(size==Beverage.SMALL){
            cost= 4;
        }
        else if(size==Beverage.MEDIUM){
            cost= 5;
        }
        else if(size==Beverage.LARGE){
            cost= 6;
        }
        if(hasLemon){
            cost += 1;
        }
    }
}
