
// you are given a calendar date. you need to find the day of the week for that date.
// you can use the zeller's congruence formula to solve this problem.
// zeller's congruence formula is: f(m, d, y) = (d
// 14) + (13 * (m + 1) / 5) + y
//  4) + 2 * y
//  4) + 6
// where m is the month (1-12), d is the day (1-31),
// and y is the year (after 1752). the result is the day of the week
// where 0 = Saturday, 1 = Sunday, 2 = Monday, 3 =
// Tuesday, 4 = Wednesday, 5 = Thursday, 6 = Friday.
import java.util.Scanner;

public class ZellersCongruence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (after 1752): ");
        int year = scanner.nextInt();

        // Adjust month and year for Zeller's Congruence
        if (month < 3) {
            month += 12; // January and February are treated as 13 and 14
            year -= 1; // Decrease the year by 1
        }

        // Calculate using Zeller's Congruence
        int k = year % 100; // The year within the century6
        int j = year / 100; // The zero-based century

        // Zeller's formula
        int f = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) - (2 * j)) % 7;
        System.out.println(f);
        if (f == -1)
            f = 7 + f;
        // Map the result to the day of the week
        String[] daysOfWeek = { "Saturday", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday" };
        String dayOfWeek = daysOfWeek[f];

        // Output the result
        System.out.println("The day of the week is: " + dayOfWeek);

        // Close the scanner
        scanner.close();
    }
}