public class VowelaConsonantsCount {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
