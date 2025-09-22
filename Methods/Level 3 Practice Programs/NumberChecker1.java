/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.
*/
public class NumberChecker1 {
    public static void main(String[] args) {
        int number = 153; // Example number
        int count = countDigits(number);
        int[] digitsArray = storeDigits(number);
        boolean isDuck = isDuckNumber(digitsArray);
        boolean isArmstrong = isArmstrongNumber(number, digitsArray);
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digitsArray);
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digitsArray);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + java.util.Arrays.toString(digitsArray));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest and Second Largest: " + java.util.Arrays.toString(largestAndSecondLargest));
        System.out.println("Smallest and Second Smallest: " + java.util.Arrays.toString(smallestAndSecondSmallest));
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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
