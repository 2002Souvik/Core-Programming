public class ReplaceWithWordwithAnotherwordinSentance {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        String modifiedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}
