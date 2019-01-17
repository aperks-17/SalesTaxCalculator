import java.util.Scanner;
/**
 * Write a description of class Sales here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TaxCalculator
{
    
   
    
    public TaxCalculator()
    {
       
       
    }
    
    public static void Run()
    {
       Scanner input=new Scanner(System.in);
        System.out.println("Are we calculating sales tax or interest rate? (ex. sales tax= st, interest rate= ir)");
        String a=input.nextLine();
        System.out.println("Input amount");
        double amount=input.nextDouble();
        
        double percent=0;
        
        if(a.equals("st"))
        {
            System.out.println("Tax percentage (ex. 5, 6.5, 7, etc.)");
            percent=input.nextDouble();
        }
        else if(a.equals("ir"))
        {
            System.out.println("Interest rate percentage (ex. 5, 6.5, 7, etc.)");
            percent=input.nextDouble();
           
        }
        double salesTax=CalculateSalesTax(amount,percent);
        double total=CalculateTotalAmount(amount,salesTax);
      
        if(a.equals("st"))
        {
            
            System.out.println("The sales tax is $"+salesTax);
            System.out.println("The total is $"+total);
            
        }
        else if(a.equals("ir"))
        {
           
            System.out.println("The interest rate is $"+salesTax);
            System.out.println("The total is $"+total);
        }
        else
        {
            System.out.println("Sorry Charlie");
        }
        
    }

    public static double CalculateSalesTax(double inputAmount, double taxPercent)
    {
        double salesTax=inputAmount*(taxPercent/100.);
        return salesTax;
    }
    public static double CalculateTotalAmount(double inputAmount, double salesTax)
    {
        double total=inputAmount+salesTax;
        return total;
    }   
}
