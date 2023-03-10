//Program to find what type of triangle it is based on the length of the sides.
//AUTHOR:Rishi(parthanux)
import java.util.*;
public class prog3 {
    void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        //taking input for three sides.
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){//if length of all sides are same
            System.out.println("Equilateral triangle");
        }
        else if(a==b||b==c||a==c){//if length of two sides are same 
            System.out.println("Isoceles Triangle");
        }
        //if length of no sides are same
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
