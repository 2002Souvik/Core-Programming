/*
Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7

*/
public class CalendarDisplay {
    public static void main(String[] args) {
        int month = 2; // February
        int year = 2000;

        displayCalendar(month, year);
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0;
    }
}
