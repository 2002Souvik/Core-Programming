public class ToggleCaseofCharacters {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder toggled = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }

        System.out.println("Toggled Case String: " + toggled.toString());
    }
}
