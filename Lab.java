public class Lab
{
    public static void main(String args[])
    {
        int x=30;
        int y=40;
        int z=20;
        int temp=x;
        if(temp>y)
        {
            temp=y;
            System.out.println("minimum seating capacity l2:"+y);
            
        }
        else if(temp>z)
        {
            temp=z;
            System.out.println("minimum seating capacity l3:"+z);
            
        }
        else
        {
            System.out.println("minimum seating capacity l1:"+x);
        }
    }
}