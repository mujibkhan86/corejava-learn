package com.learn.abstractandpoly;

public class Car extends Vehicle{
    private int noOfDoors;
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vroom......");
    }
}