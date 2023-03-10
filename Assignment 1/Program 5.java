//Program to calculate tax based on salary.
//AUTHOR:Rishi(parthanux)
import java.util.*;
class prog5
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        String nm=sc.nextLine();//storing name
        System.out.println("Enter salary:");
        int sal=sc.nextInt();//storing salary
        int tax=0;//total taxable amount
        int amnt=0;//used to calculate the tax
        if(sal<=10000){
            System.out.println("Tax=0");;
        }
        else if(sal>10000&&sal<15000){
            amnt=sal-10000;
            tax=((amnt/100)*5);
            System.out.println("Tax="+tax);
        }
        else if(sal>15000&&sal<25000){
            amnt=sal-15000;
            tax=((amnt/100)*10);
            System.out.println("Tax="+tax);
        }
    }
}
