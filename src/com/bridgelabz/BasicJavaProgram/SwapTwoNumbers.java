package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Before swapping");
        System.out.println("Enter a First number :");
        int num1 = scan.nextInt();
        System.out.println("Enter a second number :");
        int num2 = scan.nextInt();
        System.out.println("After swapping");
        System.out.println("The First number is:" + num2);
        System.out.println("The second number is :" + num1);
    }
}
