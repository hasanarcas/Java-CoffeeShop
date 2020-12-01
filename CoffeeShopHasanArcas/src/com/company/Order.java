package com.company;
import java.util.ArrayList;
public class Order {
    int costTotal;
    String expectedOutput = "";
    ArrayList<OrderItem> orders = new ArrayList();
    public void add(OrderItem orderItem){
        orders.add(orderItem);
    }
    public void totalCost(){
        for(int i=0; i <= orders.size(); i++){
            orders.get(i).cost();
            costTotal += orders.get(i).cost;
        }
    }

    @Override
    public String toString() {
        for(int i=0; i < orders.size(); i++){
            if(orders.get(i).constructor==1){
                orders.get(i).cost();
                costTotal += orders.get(i).cost;
                expectedOutput += orders.get(i).amount;
                expectedOutput += " ";
                if(orders.get(i).cBeverage.size == 1){
                    expectedOutput += "Small";
                }
                else if(orders.get(i).cBeverage.size == 2){
                    expectedOutput += "Medium";
                }
                else if(orders.get(i).cBeverage.size == 3){
                    expectedOutput += "Large";
                }
                expectedOutput += " ";
                expectedOutput += orders.get(i).cBeverage.name;
                expectedOutput += " ";
                if(orders.get(i).cBeverage.hasMilk){
                    expectedOutput += "with Milk";
                }
                else{
                    expectedOutput += "without Milk";
                }
                expectedOutput += " ";
                expectedOutput += orders.get(i).cost;
                expectedOutput += " TL \n";
            }
            if(orders.get(i).constructor==2){
                orders.get(i).cost();
                costTotal += orders.get(i).cost;
                expectedOutput += orders.get(i).amount;
                expectedOutput += " ";
                if(orders.get(i).tBeverage.size == 1){
                    expectedOutput += "Small";
                }
                else if(orders.get(i).tBeverage.size == 2){
                    expectedOutput += "Medium";
                }
                else if(orders.get(i).tBeverage.size == 3){
                    expectedOutput += "Large";
                }
                expectedOutput += " ";
                expectedOutput += orders.get(i).tBeverage.name;
                expectedOutput += " ";
                if(orders.get(i).tBeverage.hasLemon){
                    expectedOutput += "with Lemon";
                }
                else{
                    expectedOutput += "without Lemon";
                }
                expectedOutput += " ";
                expectedOutput += orders.get(i).cost;
                expectedOutput += " TL \n";
            }


        }
        expectedOutput += "TOTAL : "+costTotal+ " TL";
        return expectedOutput;
    }
}
