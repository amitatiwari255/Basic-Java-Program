package com.bridgelabz.BasicJavaProgram;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character to check whether it's a vowel or not");
        char ch = scan.next().charAt(0);
        int i = 0;
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                ++i;
        }
        if (i == 1) {
            System.out.println("Entered character " + ch + " is  Vowel");
        } else if ((ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
            System.out.println("Not an alphabet");
        } else {
            System.out.println("Entered character " + ch + " is Consonant");
        }
    }
}
