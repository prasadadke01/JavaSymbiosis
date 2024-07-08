
class lucky
{
public static void main(String args[])
{
int n=3122;
int a,b,c,d;
int rem,rem2,rem3;


rem=n%1000;
 a = n-rem;
a=a/1000;

rem2=rem%100;
b=rem-rem2;
b=b/100;

rem3=rem2%10;
c=rem2-rem3;
c=c/10;

d=rem3;

if((a+b)==(c+d)){
System.out.println("no. is lucky " );
}
else
{System.out.println("no. is not lucky");}
}
}