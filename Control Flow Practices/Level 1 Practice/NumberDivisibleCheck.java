public class NumberDivisibleCheck {
    public static void main(String[] args) {
        int number = 10; // Example number to check
        int divisor = 5; // Example divisor

        if (isDivisible(number, divisor)) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }
    }

    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }
}
