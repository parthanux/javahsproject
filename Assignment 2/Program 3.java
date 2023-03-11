//program to check if given number is prime
//AUTHOR:Rishi(parthanux)
import java.util.*;

class p3 {
    // Declare the main method, which is the entry point of the program
    static void main() {
        // Create a scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number");
        
        // Read the input number from the console
        int n = sc.nextInt();
        
        // Initialize a counter variable to keep track of the number of factors
        int k = 0;
        
        // Loop through all integers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // If i is a factor, increment the counter
                k++;
            }
        }
        
        // Check if the input number has exactly 2 factors (1 and itself)
        if (k == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
