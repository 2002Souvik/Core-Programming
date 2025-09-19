public class BMICheck {
    public static void main(String[] args) {
        double weightInKg = 70; // Example weight
        double heightInMeters = 1.75; // Example height

        String bmiCategory = checkBMI(weightInKg, heightInMeters);
        System.out.println("BMI Category: " + bmiCategory);
    }

    public static String checkBMI(double weightInKg, double heightInMeters) {
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
    
}
