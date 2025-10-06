/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 

*/
import java.util.Scanner;
public class ShortestLongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: "); // Java is a programming language
        String inputString = scanner.nextLine();
        
        String[] words = manualSplit(inputString);
        String[][] wordLengthTable = createWordLengthTable(words);
        String[] shortestLongest = findShortestLongest(wordLengthTable);
        
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);
        
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
    
    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when index is out of bounds
        }
        return count;
    }
    
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return table;
    }
    
    public static String[] findShortestLongest(String[][] wordLengthTable) {
        if (wordLengthTable.length == 0) {
            return new String[]{"", ""};
        }
        
        String shortestWord = wordLengthTable[0][0];
        String longestWord = wordLengthTable[0][0];
        
        for (String[] row : wordLengthTable) {
            String word = row[0];
            int length = Integer.parseInt(row[1]);
            
            if (length < findStringLength(shortestWord)) {
                shortestWord = word;
            }
            if (length > findStringLength(longestWord)) {
                longestWord = word;
            }
        }
        return new String[]{shortestWord, longestWord};
    }
}
