/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

*/
import java.util.Scanner;
public class YourCmiHightIntoFtAndInch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();
        
        double inches = cm / 2.54; // Centimeters to inches
        int feet = (int)(inches / 12); // Calculate feet
        inches = inches % 12; // Remaining inches
        
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inches);
        
        input.close();
    }
}
