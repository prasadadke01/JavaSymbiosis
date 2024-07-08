import java.util.Scanner;
class factor
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n ;
int i;
int sum=0;

System.out.println("Enter any number: ");
n = sc.nextInt();
System.out.println("factors of " + n + " are");
for(i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.println(i);
sum += i;
}
}
System.out.println("Sum of factors: "+sum);

}
}