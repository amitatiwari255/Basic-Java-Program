package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter an Year : ");
        Scanner Leap = new Scanner(System.in);
        int year = Leap.nextInt();
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            System.out.println(" Year is not a leap year");
        } else {
            System.out.println(" Year is a leap year");
        }
    }
}
