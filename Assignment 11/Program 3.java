//Sort numbers using binary sort

import java.util.*; //importing the utility package
public class p3{ //defining a public class named p3
    public static void main(){ //defining the main method
        Scanner sc=new Scanner(System.in); //creating a Scanner object to take user input
        int a[]=new int[10]; //declaring an array of 10 integers
        int size=0; //declaring a variable to store the size of the array after deletion
        System.out.println("Enter 1st number"); //printing a message to prompt the user for the first number
        a[0]=sc.nextInt(); //taking an integer input from the user and storing it in the first position of the array
        System.out.println("Enter 9 more numbers"); //printing a message to prompt the user for nine more numbers
        for(int i=1;i<10;i++){ //looping from 1 to 9 
            a[i]=sc.nextInt(); //taking an integer input from the user and storing it in the ith position of the array
            if(a[i]<=a[i-1]){ //checking if the current input is less than or equal to the previous input 
                System.out.println("Enter number in proper order"); //printing a message to ask the user to enter number in ascending order 
                i--; //decrementing i by 1 to repeat this iteration 
            }
        }
        System.out.println("Enter a number to be searched"); //printing a message to prompt the user for a number to be searched 
        int n=sc.nextInt(); //taking an integer input from the user and storing it in n 
        int u,l,m; //declaring three variables for upper bound, lower bound and middle index of binary search 
        m=0; 
        l=0; 
        u=9;
        int fl=0; //declaring a flag variable to indicate whether n is found or not 
        m=(u+l)/2; //calculating m as half of u+l 
        while(l<=u){ //looping until l is less than or equal to u 
            if(a[m]<n) //comparing n with the element at mth index of array  
                l=m+1;
            //updating l as m+1 
            else if(a[m]>n) //comparing n with the element at mth index of array 
                u=m-1; //updating u as m-1 
            else { //if n is equal to the element at mth index of array 
                fl=1; //setting fl as 1 to indicate n is found 
                break; //breaking out of the loop 
            }
            m=(u+l)/2; //recalculating m as half of u+l 
        }
        if(fl==0) //checking if fl is 0 i.e. n is not found 
            System.out.println("Not found"); //printing a message to indicate n is not found 
        else{ //if fl is 1 i.e. n is found 
            System.out.println("Found"); //printing a message to indicate n is found
            size=9; //setting size as 9 i.e. one less than the original array size  
            for(int i=m;i<9;i++) //looping from m to 9
                a[i]=a[i+1]; //shifting each element from right to left by one position starting from mth index  
        }
        System.out.println("Updated array"); //printing a message to show the updated array
        for(int i=0;i<size;i++){ //looping from 0 to size-1
            System.out.print(a[i]+" "); //printing each element of the updated array separated by a space
        }
    }
}
