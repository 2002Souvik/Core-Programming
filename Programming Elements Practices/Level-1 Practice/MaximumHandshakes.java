/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
I/P => numberOfStudents
O/P => The maximum number of handshakes among ___ students is ___
*/

import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);
        
        input.close();
    }
}
