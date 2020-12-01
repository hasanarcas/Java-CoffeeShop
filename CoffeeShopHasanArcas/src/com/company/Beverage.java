package com.company;
public abstract class Beverage {
    public static final int SMALL = 1 ;
    public static final int MEDIUM = 2 ;
    public static final int LARGE = 3 ;
    public int size;
    public String name;
    public abstract void cost();
}
