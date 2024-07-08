class intSum
{
public static void main(String args[])
{
int n=5879;
int sum=0;
int rem;
while(n>0)
{
rem=n%10;
sum=rem+sum;
n=n/10;
}
System.out.print("sum: "+ sum);
}
}