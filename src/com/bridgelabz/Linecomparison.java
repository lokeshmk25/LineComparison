package com.bridgelabz;

import java.util.Scanner;

public class Linecomparison {
    public static void main(String[] args) {
        System.out.println("welcome to line comparison");
        Scanner xy = new Scanner(System.in);
        System.out.println("enter the numbers");
        int x1=xy.nextInt();
        int x2=xy.nextInt();
        int y1=xy.nextInt();
        int y2=xy.nextInt();

        Scanner ab = new Scanner(System.in);
        System.out.println("enter the ab numbers");
        int a1=ab.nextInt();
        int a2=ab.nextInt();
        int b1=ab.nextInt();
        int b2=ab.nextInt();
        //compareTo method
        Double lengthofline1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double lengthofline2 = Math.sqrt((a2-a1)*(a2-a1)+(b2-b1)*(b2-b1));
        System.out.println(lengthofline1.compareTo(lengthofline2));
    }
}
