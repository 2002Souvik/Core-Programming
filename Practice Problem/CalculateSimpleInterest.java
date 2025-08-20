public class CalculateSimpleInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Principal amount
        double rate = 5.0; 
        double time = 3.0; 

        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("The simple interest for a principal of " + principal + 
                           ", rate of " + rate + "%, and time of " + time + " years is: " + simpleInterest);
    }
}
