package com.Halftone;

public class AbstractClassDemo {

    public static void main(String[] args) {
        CementFactory cementfactory = new CementFactory();
        cementfactory.printProduct();

        Henfactory henfactory = new Henfactory();
        henfactory.printProduct();

        Factory factory = new CementFactory();
        factory.printProduct();

        Factory factory1 = new Henfactory();
        factory1.printProduct();
    }
}

abstract class Factory {

    private String productName;

    private final String factoryName;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
    }

    abstract String products();

    public void printProduct() {
        System.out.println("FactoryName=" + factoryName + ",product=" + productName);
    }

}

class CementFactory extends Factory {

    public CementFactory() {
        super("Cement factory");
    }

    @Override
    String products() {
        return "Ambuja Cement";
    }

}

class Henfactory extends Factory {

    public Henfactory() {
        super("hen factory");
    }

    @Override
    String products() {
        return "LOCAL HEN";
    }

}
