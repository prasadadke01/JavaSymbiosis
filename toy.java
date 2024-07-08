class toy
{
public static void main(String args[])
{
int x=20;
int y= 375;
int z=33;

System.out.println("Number of dozons purchased: " + x);
System.out.println("Cost per dozon: "+ y);
System.out.println("Selling price per item: "+ z);

double cost_price_of =(double)375/12;//= Rs. 31.25 
double profit = 33- cost_price_of;
double profit_perc = (profit/cost_price_of)*100;//= 5.6% 

System.out.println("sam's profit percentage is " +String.format("%.2f", profit_perc));
}
}