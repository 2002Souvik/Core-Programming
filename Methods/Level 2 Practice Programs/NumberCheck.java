/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less

*/


public class NumberCheck {
    public static void main(String[] args) {
        int[] numbers = {10, -3, 4, 7, 10};

        for (int number : numbers) {
            if (isPositive(number)) {
                if (isEven(number)) {
                    System.out.println(number + " is positive and even.");
                } else {
                    System.out.println(number + " is positive and odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult < 0) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first number is equal to the last number.");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }
}
