import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float r;
float pi=3.142;
System.out.println("Enter the radius of the circle: ");
r=sc.nextFloat();

double Circumference;
double Area;

Area = pi*r*r;
Circumference = 2*pi*r;

System.out.println("Area of a circle is: "+ Area);
System.out.println("Circumference of the circle is: "+ Circumference);
}
}