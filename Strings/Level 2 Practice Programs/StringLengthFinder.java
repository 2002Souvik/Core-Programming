/*
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.Scanner;
public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int lengthWithoutMethod = findStringLength(inputString);
        int lengthWithMethod = inputString.length();
        
        System.out.println("Length of the string without using length() method: " + lengthWithoutMethod);
        System.out.println("Length of the string using length() method: " + lengthWithMethod);
        
        scanner.close();
    }
    
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when index is out of bounds
        }
        return count;
    }
}