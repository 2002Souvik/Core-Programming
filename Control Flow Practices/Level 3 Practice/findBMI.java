public class findBMI {
    public static void main(String[] args) {
        double weight = 70.0; // in kg
        double height = 1.75; // in meters

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight.");
        } else if (bmi < 24.9) {
            System.out.println("Normal.");
        } else if (bmi < 39.9) {
            System.out.println("Overweight.");
        } else {
            System.out.println("Obese.");
        }
    }
}
