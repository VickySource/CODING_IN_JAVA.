import java.util.Scanner;
public class RealWorldeg 
{
//     Scenario:
// I and My friends went out for dinner, and I want to split the bill equally.
// I also want to know how much each person should pay.
//  What the program will do:
// Ask the user to enter the total bill amount.
// Ask how many people are splitting the bill.
// Calculate and display how much each person should pay.

static void  spillitingBill()
{
    float totalBill; int Nopeople;

    Scanner read = new Scanner(System.in);
    
      System.out.print("Enter The Total Bill Amount : ");      
      totalBill = read.nextFloat();

      System.out.print("How Many People Are Splitting The Bill : ");
      Nopeople = read.nextInt();

      if (Nopeople > 0)
     {
        float shouldPay = totalBill/Nopeople;
        System.out.println("Each Person Should Pay :- "  + shouldPay + " Rupees" );
     } 
     read.close();
}

    public static void main(String[] args)
    {
        spillitingBill();
    }
}
