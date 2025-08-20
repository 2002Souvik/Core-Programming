/*
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

public class TringleArea {
    public static void main(String[] args) {
        double base = 10.0; // base in inches
        double height = 5.0; // height in inches
        
        // Area in square inches
        double areaInSquareInches = 0.5 * base * height;
        
        // Convert area to square centimeters (1 inch = 2.54 cm)
        double areaInSquareCentimeters = areaInSquareInches * (2.54 * 2.54);
        
        System.out.println("The area of the triangle is " + areaInSquareInches + " square inches and " + areaInSquareCentimeters + " square centimeters.");
    }    
}
