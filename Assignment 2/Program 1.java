//Program to print the factorials of a number
//AUTHOR:Rishi(parthanux)
import java.util.*;
class p1{
    static void main(){
        Scanner sc=new Scanner(System.in);
        int i,f,n;
        f=1;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial :"+f);
    }
}
