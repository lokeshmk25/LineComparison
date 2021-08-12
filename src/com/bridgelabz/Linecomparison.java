package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
    public static void main(String[] args) {

//declaring variables
        System.out.println("welcome to line comparison");
        Scanner xy = new Scanner(System.in);
        System.out.println("enter the numbers");

        int x1 = xy.nextInt();
        int x2 = xy.nextInt();
        int y1 = xy.nextInt();
        int y2 = xy.nextInt();


        Scanner ab = new Scanner(System.in);
        System.out.println("enter the ab numbers");
        int a1 = ab.nextInt();
        int a2 = ab.nextInt();
        int b1 = ab.nextInt();
        int b2 = ab.nextInt();

        Double lengthofline1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double lengthofline2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));

        Linecomparison ob = new Linecomparison();
        ob.display(lengthofline1,lengthofline2);
        ob.equals(lengthofline1,lengthofline2);
        ob.compare(lengthofline1,lengthofline2);
    }
    void display(Double lengthofline1, Double lengthofline2){
        System.out.println("The length of line1 is=" +lengthofline1);
        System.out.println("The length of line2 is=" +lengthofline2);

    }

     void equals(Double lengthofline1, Double lengthofline2) {
        if(lengthofline1.equals(lengthofline2)) {
            System.out.println("The lines are equal");
        }
        else
            System.out.println("The lines are not equal");
    }
    void compare(Double lengthofline1, Double lengthofline2){
        System.out.println(lengthofline1.compareTo(lengthofline2));
    }
    }

