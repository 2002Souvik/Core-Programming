/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) 
*/


public class Random4DigitArrayMinMax {
    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }
        
        double[] results = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", results[0], results[1], results[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000; // Generates a number between 1000 and 9999
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[]{0, 0, 0};

        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }    
}
