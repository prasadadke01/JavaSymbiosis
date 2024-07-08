import java.util.Scanner;
class sumHundred
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n;
int sum=0;


while(sum<100)
{
System.out.print("Enter a number: ");
n=sc.nextInt();
sum=n+sum;
}
System.out.println("done");
}
}