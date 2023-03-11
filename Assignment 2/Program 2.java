// This code takes an input number from the user and prints all its factors
//AUTHOR:RISHI(parthanux)
import java.util.*;

class p2 {
    // Declare the main method, which is the entry point of the program
    static void main() {
        // Create a scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Declare variables to hold the input number and the loop counter
        int i, n;
        
        // Prompt the user to enter a number
        System.out.println("Enter a number");
        
        // Read the input number from the console
        n = sc.nextInt();
        
        // Print a message to indicate that we're about to print the factors
        System.out.println("Factors are: ");
        
        // Loop through all integers from 1 to n
        for (i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // If i is a factor, print it to the console
                System.out.println(i);
            }
        }
    }
}


