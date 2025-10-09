public class FindSubstringOccurrence {
    public static void main(String[] args) {
        String str = "hello world, welcome to the world of Java";
        String substr = "world";
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }

        System.out.println("The substring '" + substr + "' occurs " + count + " times.");
    }
}
