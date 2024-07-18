import java.util.Scanner;
class A
{
int side;
int length;
int breadth;

void AreaSquare(int s)
{
side=s;
int a =side*side; 
System.out.println("Area of Square is: "+ a);
}

void AreaRectangle(int l, int b)
{
length = l;
breadth = b;
int a = length*breadth;

System.out.println("Area of Rectangle is: " + a);
}
}

class Area
{
public static void main(String args[])
{
A A1 = new A();
A1.AreaSquare(5);

A A2 =new A();
A2.AreaRectangle(5,4);
}
}