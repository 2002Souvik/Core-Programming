/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it

*/

import java.util.Scanner;
public class FrindsInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        double anthonyHeight = scanner.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend;
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }


        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend;
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);

        scanner.close();
    }
}
