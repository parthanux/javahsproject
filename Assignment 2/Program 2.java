// This code takes an input number from the user and prints all its factors
//AUTHOR:RISHI(parthanux)
import java.util.*;

class p2{
static void main(){
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("Factors are: ");
for(i=1;i<=n;i++){
if(n%i==0)
System.out.println(i);
}
}
}

// The code declares a class named "p2" with a static method "main".
// The program uses a scanner object to read user input from the console.
// It then loops through all integers from 1 to n and checks if they are factors of n.
// If a factor is found, it is printed to the console.



