/*
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/
import java.util.Scanner;
public class ManualSplitComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputString = scanner.nextLine();
        
        String[] manualSplitWords = manualSplit(inputString);
        String[] builtInSplitWords = inputString.split(" ");
        
        System.out.println("Words from manual split:");
        for (String word : manualSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nWords from built-in split:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        
        boolean areEqual = compareStringArrays(manualSplitWords, builtInSplitWords);
        System.out.println("\nAre both splits equal? " + areEqual);
        
        scanner.close();
    }
    
    public static String[] manualSplit(String str) {
        int wordCount = 1; // Start with 1 to count the last word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int wordIndex = 0;
        int startIndex = 0;
        
        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                words[wordIndex] = str.substring(startIndex, i);
                wordIndex++;
                startIndex = i + 1;
            }
        }
        
        return words;
    }
    
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        
        return true;
    }
}
