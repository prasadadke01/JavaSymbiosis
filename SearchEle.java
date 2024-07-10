import java.util.Scanner;
class SearchEle
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
System.out.println("Enter element: ");
int n = sc.nextInt();

int position=0;
int count =0;
for(int i=0;i<a.length;i++)
{
if(n==a[i])
{
 position=i;
count=10;          //you can take any integer value instead of 1 i.e.  ...-3,-2,-1,2,3,4,5,6,7,8,9,10......
                   //0=true(found) and non-zero=false(not found)
}


}
if(count==10)
{System.out.println("Element is found at array location "+position);
}else{
System.out.println("Element is not found");
}
}
}