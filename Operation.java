import java.util.Scanner;
class Operation
{

public static void main(String args[])
{ 
Scanner sc = new Scanner(System.in);
System.out.println("Enter first Number: ");
int Num1 = sc.nextInt();

System.out.println("Enter second Number: ");
int Num2 = sc.nextInt();

int add = Num1 + Num2;
System.out.println("Addition of number is: " + add);
int sub = Num1 - Num2;
System.out.println("Substraction of number is: " + sub);
int mul = Num1*Num2;
System.out.println("multiplication of number is: " + mul);
double div = Num1/Num2;
System.out.println("Division of number is: " + div);

}
}