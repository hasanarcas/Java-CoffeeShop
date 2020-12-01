package com.company;

public class BlackTea extends TeaBeverage {
    public BlackTea(boolean withLemon, int size) {
        hasLemon = withLemon;
        this.size = size;
        name = "Black Tea";
    }
    @Override
    public void cost(){
        if(size==Beverage.SMALL){
            cost= 3;
        }
        else if(size==Beverage.MEDIUM){
            cost= 4;
        }
        else if(size==Beverage.LARGE){
            cost= 5;
        }
        if(hasLemon){
            cost += 1;
        }
    }
}