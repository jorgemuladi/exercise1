package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Question 1");
        Question1 question1 = new Question1();
        System.out.println("Area of rectangle is: " + question1.calAreaRectangle(10,10));
        System.out.println();

        System.out.println("Qestion 2");
        Question2 question2 = new Question2();
        System.out.println("Radius of the circle is: " + question2.calDiameter());
        System.out.println();

        System.out.println("Question 3");
    }
}