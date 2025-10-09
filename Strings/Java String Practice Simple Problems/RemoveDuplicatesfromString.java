public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String input = "Hello World";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (output.indexOf(String.valueOf(c)) == -1) {
                output.append(c);
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + output.toString());
    }
}
