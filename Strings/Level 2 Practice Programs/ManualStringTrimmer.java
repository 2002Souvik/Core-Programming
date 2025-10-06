/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/
import java.util.Scanner;
public class ManualStringTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = scanner.nextLine(); // "   Hello World!   "
        
        int[] trimIndices = manualTrim(inputString);
        String trimmedStringManual = manualSubstring(inputString, trimIndices[0], trimIndices[1]);
        String trimmedStringBuiltIn = inputString.trim();
        
        System.out.println("Trimmed string using manual method: '" + trimmedStringManual + "'");
        System.out.println("Trimmed string using built-in method: '" + trimmedStringBuiltIn + "'");
        
        boolean areEqual = compareStrings(trimmedStringManual, trimmedStringBuiltIn);
        System.out.println("Are both trimmed strings equal? " + areEqual);
        
        scanner.close();
    }
    
    public static int[] manualTrim(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end + 1}; // end + 1 to make it exclusive
    }
    
    public static String manualSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
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
}
