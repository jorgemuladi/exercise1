package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo {
    public static void runExercise() {
        System.out.println("Exercise 1");

        //Question 1 Rectangle Area
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.printf("Enter rectangle width: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length,width);
        System.out.println("The area of rectangle is: " + rectangle.calAreaRectangle());

        //Question 2 Circle
        Circle circle = new Circle(5);


        System.out.printf("Circle - Diameter: %.0f, Circumference: %.4f, Area: %.3f%n",
                circle.calDiameter(),
                circle.calCircumference(),
                circle.calArea());

        //Question 3 Angle

        System.out.println("Third angle for the triangle is: " + Triangle.calThirdAngle(80,65));

        //Question 4

        LocalDate date1 = LocalDate.of(2024,3,19);
        LocalDate date2 = LocalDate.of(2024,3,21);
        System.out.println("Days between dates: " + org.example.Day2.TimeDiff.getDaysBetween(date1,date2));

        //Question 5

        System.out.println("Name initials: " + NameInitial.getInitial("John Doe"));




    }
}
