package com.Halftone;

public class InheritanceDemo {

    public static void main(String[] args) {
        MarutiCar maruticar = new MarutiCar();
        Suzuki suzukicar = new Suzuki();
    }

}

class Car {

    private int noOfWheel;
    private double price;
    private String name;
    private double speed;

    public Car(int noOfWheel, double price, String name, double speed) {
        this.noOfWheel = noOfWheel;
        this.price = price;
        this.name = name;
        this.speed = speed;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void show() {
        System.out.println("Car["
                + "noOfWheels=" + getNoOfWheel()
                + ",Price=" + getPrice()
                + ",Name=" + getName()
                + ",Speed=" + getSpeed()
                + "]");
    }
}

class MarutiCar extends Car {

    public MarutiCar() {
        super(4, 100000, "Maruti", 102.34);
        super.show();

    }

}

class Suzuki extends Car {

    public Suzuki() {
        super(6, 200000, "Suzuki small", 300.50);
        super.show();

    }

}
