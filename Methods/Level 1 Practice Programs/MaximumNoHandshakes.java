/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/
import java.util.Scanner;
public class MaximumNoHandshakes {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least two students are required for handshakes.");
        } else {
            int handshakes = calculateHandshakes(n);
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        sc.close();
    }

}
