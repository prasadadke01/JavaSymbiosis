
import java.util.Scanner;
class CI
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float P,N;
float R;
double A;
System.out.println("Enter Principle Amount: ");
P=sc.nextFloat();

System.out.println("Enter rate of interest: ");
R=sc.nextFloat();

System.out.println("Enter no. of years: ");
N=sc.nextFloat();

A=Math.pow(P*(1+(R/100)),N);
System.out.println("On compounding Amount after " + N + " years will be " + A);
}
}