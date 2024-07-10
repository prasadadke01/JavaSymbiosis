import java.util.Scanner;
class CountEle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[] a = {1,5,6,6,7,4,5,5};
System.out.println("Enter element: ");
int n = sc.nextInt();


int count =0;
for(int i=0;i<a.length;i++)
{
if(n==a[i])
{
count++;
}
}
System.out.println("count: "+count);
}
}
