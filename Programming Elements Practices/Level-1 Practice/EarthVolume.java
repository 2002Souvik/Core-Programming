/* (7)
Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0; // Radius of Earth in kilometers
        double pi = Math.PI;
        
        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        
        // 1 km^3 = 0.239913 cubic miles
        // Convert volume to cubic miles (1 km^3 = 0.239913 cubic miles)
        double volumeMiles3 = volumeKm3 * 0.239913;
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
