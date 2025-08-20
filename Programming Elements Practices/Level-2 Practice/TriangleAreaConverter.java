/*
Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___
*/
public class TriangleAreaConverter {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter the base of the triangle in cm: ");
        float base = scanner.nextFloat();
        
        System.out.print("Enter the height of the triangle in cm: ");
        float height = scanner.nextFloat();
        
        float areaCm = 0.5f * base * height;
        
        float areaIn = areaCm / (2.54f * 2.54f);
        
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", areaIn, areaCm);
        
        scanner.close();
    }
}
