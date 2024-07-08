
import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
boolean isprime = true;

System.out.print("Enter a number: ");
n=sc.nextInt();


for(int i=2;i<=n/2;i++)
{
if(n%i==0)
{
isprime= false;
break;
}
}
if(isprime)
{
System.out.println("no. " +n+" is prime.");
}
else{
System.out.println("no. is not prime.");
}

}
}