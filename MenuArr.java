
import java.util.*;

class MenuArr
{
ArrayList<Integer> list= new ArrayList<>();
Scanner sc  = new Scanner(System.in);
public void Insert()
{
System.out.println("Enter NO. of elements: ");
int num = sc.nextInt();

System.out.println("Enter Elements: ");
for(int i=0; i<num; i++)
{
list.add(sc.nextInt());
}
}

public void Remove()
{
System.out.println("Enter elements you want Remove");
int remove = sc.nextInt();
if(!list.contains(remove))
{
System.out.println("Element not found");
}else
{
list.remove(Integer.valueOf(remove));
}
}
void Sort()
{
System.out.println("Sorted elements are: ");
Collections.sort(list);//collection does not return array list
System.out.println(list);
}

void Display()
{
System.out.println("Array list: "+ list);
}
public static void main(String args[])
{
MenuArr obj = new MenuArr();
Scanner sc = new Scanner(System.in);




while(true)
{
System.out.println("1.Insert.");
System.out.println("2..Remove");
System.out.println("3.Sort.");
System.out.println("4.Display");
System.out.println("5.exit");

System.out.println("Enter your choice: ");
int choice=sc.nextInt();

switch(choice)
{
case 1:
obj.Insert();
break;

case 2:
obj.Remove();
break;

case 3:
obj.Sort();
break;

case 4:
obj.Display();
break;

case 5:
System.exit(0);
break;

default:
System.out.println("Invalid input");
}
}

}
}