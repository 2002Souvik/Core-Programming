/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/

public class StringIndexDemo {
    public static void generateException() {
        String text = "Hello, World!";
        System.out.println("Character at index 20: " + text.charAt(20));
    }

    public static void handleException() {
        String text = "Hello, World!";
        try {
            System.out.println("Character at index 20: " + text.charAt(20));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: Index is out of bounds.");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("-------------");

        handleException();
    }
}
