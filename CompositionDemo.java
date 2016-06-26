package com.Halftone;

public class CompositionDemo {

    public static void main(String[] args) {
        HPPc hppc = new HPPc();
        System.out.println("HP=" + hppc.basicProps() + " " + hppc.graphicsProps());

        Pc hoPc = new HPPc();
        System.out.println("HPPC=" + hoPc.basicProps());

        GamingPc gamingPc = new HPPc();
        System.out.println("HPGAMING=" + gamingPc.graphicsProps());

        AcerPc acerPc = new AcerPc();
        System.out.println("Acer=" + acerPc.basicProps());
    }

}

interface Pc {

    default void show() {
        System.out.println("Interface dfault");

    }

    String basicProps();

}

interface GamingPc {

    String graphicsProps();

}

class HPPc implements Pc, GamingPc {

    @Override
    public String basicProps() {
        return "{RAM=8GB,Processor=i5,HDD=1TB}";
    }

    @Override
    public String graphicsProps() {
        return "{RADEON=3GB}";
    }

}

class AcerPc implements Pc {

    @Override
    public String basicProps() {
        return "{RAM=2GB, Processor=i3, HDD=500GB}";
    }

}
