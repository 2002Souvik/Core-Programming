/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 
*/

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = scanner.nextInt();
        
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number * i);
        }
        
        scanner.close();
    } 
}
