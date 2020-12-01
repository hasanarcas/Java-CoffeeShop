package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * A group of fiends ordered
         * 2 Small-sized Latte with Milk
         * 2 Medium-sized Cappucino without Milk
         * 1 Large-sized Americano with Milk
         * 3 Small-sized Black Tea without Lemon
         * 1 Medium-sized Green Tea with Lemon
         * 1 Small-sized Linden Tea with Lemon
         */
        Order order = new Order();
        CaffeineBeverage cBeverage = new Latte(true, Beverage.SMALL);
        order.add(new OrderItem(cBeverage, 2));
        cBeverage = new Cappucino(false, Beverage.MEDIUM);
        order.add(new OrderItem(cBeverage, 2));
        cBeverage = new Americano(true, Beverage.LARGE);
        order.add(new OrderItem(cBeverage, 1));
        TeaBeverage tBeverage = new BlackTea(false, Beverage.SMALL);
        order.add(new OrderItem(tBeverage, 3));
        tBeverage = new GreenTea(true, Beverage.MEDIUM);
        order.add(new OrderItem(tBeverage, 1));
        tBeverage = new LindenTea(true, Beverage.SMALL);
        order.add(new OrderItem(tBeverage, 1));
        //print the order
        System.out.println(order);
        //Expected output :
        // 2 Small Latte with Milk 12 TL
        // 2 Medium Cappucino without Milk 14 TL
        // 1 Large Americano with Milk 10 TL
        // 3 Small Black Tea without Lemon 9 TL
        // 1 Medium Green Tea with Lemon 6 TL
        // 1 Small Linden Tea with Lemon 6 TL
        // TOTAL : 57 TL
    }
}
