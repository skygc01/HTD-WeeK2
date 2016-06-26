/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Halftone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author sky
 */
public class JavaSerializationDemo {

    public static void main(String[] args) throws Exception {
        JavaSerializationDemo demo = new JavaSerializationDemo();

        System.out.println("SERILIZATION---------");
        demo.serilization();

        System.out.println("DESERILIZATION-------");
        demo.deserilizaton();
    }

    public void serilization() throws FileNotFoundException, IOException {
        Student student = new Student("ram", "Computer");
         FileOutputStream outputStream = new FileOutputStream("/home/sky/Downloads/serial");
         ObjectOutputStream stream =new ObjectOutputStream(outputStream);
         stream.writeObject(student);
         stream.close();
         outputStream.close();
    }

    public void deserilizaton() throws FileNotFoundException,IOException, ClassNotFoundException {
      FileInputStream inputStream = new FileInputStream("/home/sky/Downloads/serial");
      ObjectInputStream stream =new ObjectInputStream(inputStream);
      Student student = (Student) stream.readObject();
      
        System.out.println("Student["+student.getName()+","+student.getFaculty()+"]");
    
    }
}

class Student implements Serializable{

    private String name;
    private String faculty;

    public Student(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;

    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
