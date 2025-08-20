/*
Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
*/

import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        float distanceInFeet = scanner.nextFloat();
        
        float distanceInYards = distanceInFeet / 3;
        float distanceInMiles = distanceInYards / 1760;
        
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", distanceInYards, distanceInMiles);
        
        scanner.close();
    }
}
