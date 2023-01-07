package com.bridgelabz.BasicJavaProgram;
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        int initial = 0;
        for(int powerOfTwo = 1; initial <= n; ++initial) {
            System.out.println(initial + "th power of two is equal to " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
        }
    }
}
