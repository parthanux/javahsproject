// Program to calculate the average of marks and display pass or fail
// Author: Rishi Paul(parthanux)
import java.util.*;

public class Program1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT\n");
        // Ask user for name
        System.out.println("Enter name of the student");
        String nm = sc.nextLine();

        // Ask user for Physics marks
        System.out.println("Enter Physics Marks");
        int phy = sc.nextInt();

        // Ask user for Chemistry marks
        System.out.println("Enter Chemistry Marks");
        int chm = sc.nextInt();

        // Ask user for Maths marks
        System.out.println("Enter Maths Marks");
        int mth = sc.nextInt();

        // Calculate average of the three subjects
        int avg = (phy + mth + chm) / 3;

        System.out.println("\nOUTPUT\n");

        // Display student name and average marks
        System.out.println("Name: " + nm + "\nAverage: " + avg);

        // Display pass or fail based on average marks
        if (avg >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
