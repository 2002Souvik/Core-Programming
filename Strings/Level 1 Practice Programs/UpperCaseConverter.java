/*
Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the uppercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the uppercase text and compare the two strings using the user-defined method. And finally display the result
*/
public class UpperCaseConverter {
    public static String convertToUpperCase(String input) {
        StringBuilder upperCaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            upperCaseString.append(ch);
        }
        return upperCaseString.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string:");
        String userInput = scanner.nextLine();

        String convertedString = convertToUpperCase(userInput);
        String builtInUpperCaseString = userInput.toUpperCase();

        System.out.println("Converted String: " + convertedString);
        System.out.println("Built-in Uppercase String: " + builtInUpperCaseString);

        boolean areEqual = compareStrings(convertedString, builtInUpperCaseString);
        System.out.println("Are both strings equal? " + areEqual);

        scanner.close();
    }
}
