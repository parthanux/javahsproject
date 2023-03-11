//AUTHOR:Rishi(parthanux)
import java.util.*;

class p4 {
    // Declare the main method, which is the entry point of the program
    static void main() {
        // Create a scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number");
        
        // Read the input number from the console
        int n = sc.nextInt();
        
        // Initialize a counter variable to keep track of the sum of factors
        int k = 0;
        
        // Loop through all integers from 1 to n (inclusive)
        for (int i = 1; i <= n; i++) {
            // Check if i is a factor of n
            if (n % i == 0) {
                // If i is a factor, add it to the sum
                k += i;
            }
        }
        
        // Check if the sum of factors is equal to the input number
        if (k == n) {
            System.out.println("Perfect number");
        } else if (k < n) {
            System.out.println("Deficient number");
        } else {
            System.out.println("Abundant number");
        }
    }
}
