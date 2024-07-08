import java.util.Scanner;
class tax
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

float Amount;
float Withdraw;



System.out.println("Enter amount: ");
Amount = sc.nextFloat();

System.out.println("Enter withdrawl amount: ");
Withdraw = sc.nextFloat();

double NewAmount1;
NewAmount1 = Amount - Withdraw;
double NewAmount2 =NewAmount1 - 0.1*NewAmount1;
if(Amount>=25000)
{

System.out.println("Remaining money is: " + NewAmount2);
}
else
{
System.out.println("Remaining money is: " + NewAmount1);
}
}
}