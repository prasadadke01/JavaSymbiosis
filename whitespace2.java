import java.util.Scanner;
class whitespace2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int count=1;

System.out.println("Enter string: ");
String n = sc.nextLine();

for(int i=0; i<n.length();i++)
{
if(n.charAt(i)==' ')
{
count++;
}
}
System.out.println("No.of whitespace in string: " + count);

}
}
