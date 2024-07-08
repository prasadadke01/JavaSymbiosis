import java.util.Scanner;
class diaMatrix
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[][] a=new int[3][3];
System.out.println("Enter any matrix: ");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 a[i][j]=sc.nextInt();
}
}
System.out.println("matrix is: ");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
 System.out.print(a[i][j]+" ");
}
 System.out.println();
}

int sum1=0,sum2=0;


for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(i==j)
{
 sum1=sum1 + a[i][j];
}
if(i+j==2)
{
 sum2=sum2 + a[i][j];
}
}
}
System.out.println("sum of first diagonal elements is:" +sum1);
System.out.println("sum of second diagonal elements is:" +sum2);
}
}