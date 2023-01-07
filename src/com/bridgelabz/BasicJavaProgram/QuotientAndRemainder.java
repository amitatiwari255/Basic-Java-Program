package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a First number :");
        int num1 = scan.nextInt();
        System.out.println("Enter a Second  number :");
        int num2 = scan.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}

