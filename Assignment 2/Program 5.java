// This program calculates LCM and HCF of two given numbers.
//AUTHOR:RISHI(parthanux)
import java.util.*; // import the java.util package

class p5{ // define a class named "p5"
static void main(){ // define the main method
Scanner sc=new Scanner(System.in); // create a Scanner object to read input from the user
System.out.println("Enter 2 numbers"); // prompt the user to enter two numbers
int a=sc.nextInt(); // read the first number from the user
int b=sc.nextInt(); // read the second number from the user
int HCF=0; // initialize the HCF variable to zero
int LCM=0; // initialize the LCM variable to zero
for(int i=1;i<=a&&i<=b;i++){ // loop through all the numbers from 1 to the smaller of the two given numbers
if(a%i==0&&b%i==0){ // check if i is a common factor of both a and b
HCF=i; // update the HCF variable to the current value of i
}
}
LCM=(ab)/HCF10; // calculate the LCM using the formula (ab)/HCF10
System.out.println("LCM "+LCM+"\nHCF "+HCF); // print the LCM and HCF values to the console
}
}
