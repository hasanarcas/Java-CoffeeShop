package com.company;

public class LindenTea extends TeaBeverage {
    public LindenTea(boolean withLemon, int size) {
        hasLemon = withLemon;
        this.size = size;
        name = "Lindean Tea";
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
        if(hasLemon){
            cost += 1;
        }
    }
}
