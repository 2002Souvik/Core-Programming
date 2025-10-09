public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "example string with several letters";
        int[] frequency = new int[256]; // ASCII character set size

        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequentChar = (char) i;
            }
        }

        System.out.println("Most frequent character: " + mostFrequentChar + " (occurs " + maxCount + " times)");
    } 
}
