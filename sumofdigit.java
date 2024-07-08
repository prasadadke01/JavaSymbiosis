import java.util.Scanner;
public class sumofdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the number :");
        int num=sc.nextInt();     
        
        int sum=0,rem=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.print("Sum of the number is:"+sum);

    }
}