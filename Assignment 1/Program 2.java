// Program to convert number of days into years, months and weeks
// Author: Rishi Paul (parthanux)
import java.util.*;

class Program2 {
static void main() {
Scanner sc = new Scanner(System.in);
    // Ask user for number of days
    System.out.println("Enter no of days");
    int days = sc.nextInt();
    
    // Convert days to years, months and weeks
    int years = days / 365;
    int months = days / 30;
    int weeks = days / 7;
    
    // Display the converted values
    System.out.println("Years: " + years + "\nMonths: " + months + "\nWeeks: " + weeks);
}
}
