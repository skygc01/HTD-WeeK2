package com.Halftone;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(20, "Ram");

        Person P2 = (Person) p1.clone();
        p1.setName("Sita");
        System.out.println("P1=" + p1);
        System.out.println("P2=" + P2);
    }
}

class Person implements Cloneable {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //return this;
    }

}
