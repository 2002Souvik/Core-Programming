/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the frequency with digit in the first column and frequency in the second column.

*/
public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 7844; //number
        int count = countDigits(number);
        int[] digitsArray = storeDigits(number);
        int sumOfDigits = sumOfDigits(digitsArray);
        int sumOfSquares = sumOfSquares(digitsArray);
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        int[][] frequency = digitFrequency(digitsArray);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + java.util.Arrays.toString(digitsArray));
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit Frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1] + " time(s)");
            }
        }
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
}