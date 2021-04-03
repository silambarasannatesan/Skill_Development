package com.designpatterns.simplefactory;

// Simple Factory class to create objects
public class WoodenFactory {

    public static Door makeDoor(float width, float height) {
        return new WoodenDoor(width, height);
    }


    // testing method
    public static void main(String[] args) {
        WoodenFactory woodenFactory = new WoodenFactory();
        woodenFactory.makeDoor(10.0f, 24.7f);
        System.out.println(woodenFactory.toString());

    }
}
