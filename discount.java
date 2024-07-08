import java.util.Scanner;
public class discount
{
    public static void main(String args[])
    {
        float item1;
        float item2;
        double disc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of item1:");
        item1=sc.nextFloat();
        System.out.println("Enter the price of item2:");
        item2=sc.nextFloat();
        System.out.println("Enter the discount to be given:");
        int n=sc.nextInt();

        double totalAmount=item1+item2;

        disc=totalAmount-(n*totalAmount)/100;
        double savedAmount = totalAmount-disc;

        System.out.printf("Total Amount is:" +totalAmount);
        System.out.println("Discount Amount"+ disc);
        System.out.println("Saved Amount: " +savedAmount);


    }
}