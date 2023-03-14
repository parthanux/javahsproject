//Sort elements in an array using bubble sort
//AUTHOR:RISHI(parthanux)
import java.util.*; //importing the utility package
class p1 //defining a class named p1
{
    static void main() //defining the main method
    {
        Scanner sc=new Scanner(System.in); //creating a Scanner object to take user input
        int a[]=new int[10]; //declaring an array of 10 integers
        int i,j,t; //declaring three variables for loop control and swapping
        System.out.println("Enter 10 numbers"); //printing a message to prompt the user
        for(i=0;i<10;i++) //looping from 0 to 9
        {
            a[i]=sc.nextInt(); //taking an integer input from the user and storing it in the array
        }
        for(i=0;i<10;i++)  //looping from 0 to 9 
        {  
            for(j=i+1;j<10;j++)  //looping from i+1 to 9 
            {  
                if(a[i]>a[j])  //comparing two adjacent elements of the array 
                {  
                    t=a[i];  //swapping them if the first one is greater than the second one 
                    a[i]=a[j];  
                    a[j]=t;  
                }  
            }  
        }
        System.out.println("Array after sorting"); //printing a message to indicate the sorted array
        for(i=0;i<10;i++) //looping from 0 to 9 
        {
            System.out.println(a[i]); //printing each element of the sorted array on a new line
        }
    }
}
