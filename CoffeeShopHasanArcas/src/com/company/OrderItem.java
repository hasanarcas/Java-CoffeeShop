package com.company;

public class OrderItem {
    public int constructor;
    public int amount;
    public CaffeineBeverage cBeverage;
    public TeaBeverage tBeverage;
    public int cost;
    public OrderItem(CaffeineBeverage cBeverage, int amount) {
        constructor =1;
        this.amount = amount;
        this.cBeverage = cBeverage;
    }
    public OrderItem(TeaBeverage tBeverage, int amount) {
        constructor = 2 ;
        this.amount = amount;
        this.tBeverage = tBeverage;
    }
    public void cost(){
        if(constructor== 1){
            cBeverage.cost();
            cost = cBeverage.cost * amount;
        }

        if(constructor==2){
            tBeverage.cost();
            cost = tBeverage.cost *amount;
        }

    }
}
