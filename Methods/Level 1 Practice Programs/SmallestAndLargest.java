/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)

*/
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        result[0] = Math.min(number1, Math.min(number2, number3)); // Smallest
        result[1] = Math.max(number1, Math.max(number2, number3)); // Largest
        return result;
    }

    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 42;
        int number3 = 7;

        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
