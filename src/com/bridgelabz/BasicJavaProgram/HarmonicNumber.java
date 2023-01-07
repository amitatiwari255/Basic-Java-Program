package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] arg) {
        double result = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        for(int i = num; i > 0; --i) {
            result += 1.0 / (double)i;
            System.out.print(result + " , ");
        }
    }
}
