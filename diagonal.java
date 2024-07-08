import java.util.Scanner;
class diagonal
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int a[][]=new int[3][3];
int Result=0;
System.out.println("enter the matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("display matrix");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}


for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
if(a[i]==a[j])
{
Result=Result+a[i][j];
}

}
}
System.out.println("result="+Result);
}
}