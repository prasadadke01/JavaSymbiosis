import java.util.Scanner;
class SimpInt
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int P;
int N;
int R;
int SI;

System.out.println("Enter principle Amount: ");
P = sc.nextInt();

System.out.println("Enter no. of year: ");
N = sc.nextInt();

System.out.println("Enter rate: ");
R = sc.nextInt();

SI = P*N*R/100;
System.out.println("Simple interest is: "+SI);


}
}