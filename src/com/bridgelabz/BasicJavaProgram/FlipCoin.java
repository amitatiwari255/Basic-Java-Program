package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter number to flip coin number of times ");
        int heads = 0;
        int tails = 0;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        double random;
        for (int flips = scan.nextInt(); count <= flips; ++count) {
            random = Math.random();
            System.out.println(count + "  " + random);
            if (random < 0.5) {
                ++tails;
                System.out.println(" Number Of Tails " + tails);
            } else {
                ++heads;
                System.out.println(" Number of Heads " + heads);
            }
        }
    }
}
