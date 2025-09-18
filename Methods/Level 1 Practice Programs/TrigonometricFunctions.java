/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
*/
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] results = new double[3];
        results[0] = Math.sin(radians);
        results[1] = Math.cos(radians);
        results[2] = Math.tan(radians);
        return results;
    }

    public static void main(String[] args) {
        double angle = 45;
        double[] trigFunctions = calculateTrigonometricFunctions(angle);
        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine: %.4f%n", trigFunctions[0]);
        System.out.printf("Cosine: %.4f%n", trigFunctions[1]);
        System.out.printf("Tangent: %.4f%n", trigFunctions[2]);
    }
}
