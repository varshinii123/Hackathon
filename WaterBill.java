import java.util.Scanner;
public class WaterBill 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Water consumption in litres:  ");
        int waterconsumption = sc.nextInt();
        if (waterconsumption <= 500) 
            {
            System.out.println("Water bill is : Rs.100");
        }
         else {
            System.out.println("Water bill is : Rs.200");
        }
        sc.close();
    }
}