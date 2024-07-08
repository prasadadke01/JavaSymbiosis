import java.util.Scanner;
class emp
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int salary;
int expend;

System.out.println("Enter salary of employee: ");
salary = sc.nextInt();

System.out.println("Enter expenditure of employee: ");
expend = sc.nextInt();

int savings = salary - expend;
System.out.println("Saving amount of a employee is: " + savings);
}
}