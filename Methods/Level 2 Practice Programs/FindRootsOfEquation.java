/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
Write a Method to find find the roots of a quadratic equation and return the roots
*/

public class FindRootsOfEquation {
    public static void main(String[] args) {
        double a = 1; // Coefficient of x^2
        double b = -3; // Coefficient of x
        double c = 2; // Constant term

        double[] roots = findRoots(a, b, c);
        
        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.printf("One real root: %.2f%n", roots[0]);
        } else {
            System.out.printf("Two real roots: %.2f and %.2f%n", roots[0], roots[1]);
        }
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; // No real roots
        }
    }
}
