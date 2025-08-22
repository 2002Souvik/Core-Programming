public class PowerUsingWhile {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter an exponent: ");
        int exponent = scanner.nextInt();

        if (exponent < 0) {
            System.out.println("Exponent must be a non-negative integer.");
        } else {
            int result = 1;
            int count = 0;

            while (count < exponent) {
                result *= base;
                count++;
            }

            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }

        scanner.close();
    }
}
