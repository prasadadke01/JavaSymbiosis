import java.util.Scanner;
class pft
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int profit;
int sp;
int cp;

System.out.println("Enter cost price: ");
cp = sc.nextInt();

System.out.println("Enter selling price: ");
sp = sc.nextInt();

profit = sp-cp;
if(sp>cp)
{
System.out.println("Profit is: " + profit);
}
else{
System.out.println("loss");
}
}
}