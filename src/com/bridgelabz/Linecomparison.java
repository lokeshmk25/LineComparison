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

        double lengthofline = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(lengthofline);

    }
}
