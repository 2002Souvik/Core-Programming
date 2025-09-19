/*
xtend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 

*/

public class UnitConvertor {
    public static void main(String[] args) {
        double yards = 5;
        double feet = 15;
        double meters = 2;
        double inches = 10;
        double celsius = 25;
        double farhenheit = 77;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 3;
        double liters = 10;
        double kilometers = 5;
        double miles = 3;

        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
        System.out.println(farhenheit + " Fahrenheit is " + convertFahrenheitToCelsius(farhenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
        System.out.println(kilometers + " kilometers is " + (kilometers * 0.621371) + " miles.");
        System.out.println(miles + " miles is " + (miles * 1.60934) + " kilometers.");
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static double convertKilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }
}
