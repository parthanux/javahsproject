//Program to print Name,Average marks and Position based on marks of PCM
//Author:Rishi(parthanux)
import java.util.*;
public class Prog4
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT\n");//taking input for name and marks of three subjects
        System.out.println("Enter name of the student");
        String nm=sc.nextLine();
        System.out.println("Enter Physics Marks");
        int phy=sc.nextInt();
        System.out.println("Enter Chemistry Marks");
        int chm=sc.nextInt();
        System.out.println("Enter Maths Marks");
        int mth=sc.nextInt();
        int avg=(phy+mth+chm)/3;//calculating average by dividing the sum of 3 subjects
        System.out.println("\nOUTPUT\n");
        System.out.println("Name: "+nm+"\nAverage: "+avg);
        if(avg<40){
            System.out.println("Fail");
        }
        else if(avg>40&&avg<60){
            System.out.println("Third");
        }
        else if(avg>60&&avg<80){
            System.out.println("Second");
        }
        else
        System.out.println("First");
    }
}
