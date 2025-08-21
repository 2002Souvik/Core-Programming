/*
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        
        System.out.println("Is the first number the largest? " + isFirstLargest(number1, number2, number3));
        System.out.println("Is the second number the largest? " + isSecondLargest(number1, number2, number3));
        System.out.println("Is the third number the largest? " + isThirdLargest(number1, number2, number3));
        
        scanner.close();
    }

    public static boolean isFirstLargest(int a, int b, int c) {
        return a > b && a > c;
    }

    public static boolean isSecondLargest(int a, int b, int c) {
        return b > a && b > c;
    }

    public static boolean isThirdLargest(int a, int b, int c) {
        return c > a && c > b;
    }
}
