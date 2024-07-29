import java.util.Scanner;
import java.util.*;
class SortArr
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

ArrayList<Integer>  list = new ArrayList<Integer>();

System.out.println("Enter integer values: ");

int a ;
for(int i=0;i<5;i++)
{
 a = sc.nextInt(); 
list.add(a);
}
System.out.println("elements before sorting: "+list);
Collections.sort(list);
System.out.println("elements after sort: " + list);

}
}