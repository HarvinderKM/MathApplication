package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        int bobSalary = 11000;
        int garySalary = 15000;
        int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //Q2
        int carPrice = 400000;
        int truckPrice = 600000;
        int smallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The lowest vehicle price is "+ smallestPrice);

        //Q3
        double radius = 7.25;
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + circleArea);

        //Q4
        double number =5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root of the number is "+ squareRoot);

        //Q5
        //define points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // calculate distance with the formula
        double distance = Math.sqrt(Math.pow((x2 -x1),2) + Math.pow(y2-y1,2));
        System.out.println("The distance between the points "+ distance);

        //find and display the absolute value of a variable after it is set to -3.8
        float N1 = -3.8F;
        float AbValue = Math.abs(N1);
        System.out.println("The absolute value of the number is "+ AbValue);

        //Find and Display a random number between 0-1
        double Rnumber = Math.random();
        System.out.println("A random # is "+ Rnumber);


    }
}
