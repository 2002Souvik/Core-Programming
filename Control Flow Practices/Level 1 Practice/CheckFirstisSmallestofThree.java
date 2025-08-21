public class CheckFirstisSmallestofThree {
    public static void main(String[] args) {
        int a = 5; 
        int b = 10; 
        int c = 15; 

        if (isFirstSmallest(a, b, c)) {
            System.out.println(a + " is the smallest of the three numbers.");
        } else {
            System.out.println(a + " is not the smallest of the three numbers.");
        }
    }

    public static boolean isFirstSmallest(int a, int b, int c) {
        return a < b && a < c;
    }
}
