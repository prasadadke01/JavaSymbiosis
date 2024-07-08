import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
int n=123;
int rev=0;
int rem=0;



while(n!=0)
{
rem=n%10;
rev = rem +(rev * 10);
n=n/10;
}
System.out.println("reverse no. is: " + rev);
}
}