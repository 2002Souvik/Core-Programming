public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'o';
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }

        System.out.println("String after removing '" + charToRemove + "': " + result.toString());
    }
    
}
