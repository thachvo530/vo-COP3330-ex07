
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String length = scan.next();

        System.out.print("What is the width of the room in feet? " );
        String width = scan.next();

        System.out.print("You entered dimensions of "+length+" feet by "+width+" feet.");

        int lengthnum = Integer.parseInt(length);
        int widthnum = Integer.parseInt(width);

        int f2 = lengthnum * widthnum;
        final double m2 = f2 * 0.09290304;
        DecimalFormat df = new DecimalFormat(".000");

        System.out.print("\nThe area is\n"+f2+" square feet\n"+df.format(m2)+" square meters");

    }
}
