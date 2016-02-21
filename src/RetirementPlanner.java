import java.util.Scanner;
import java.text.NumberFormat;
/**
 * 
 */

/**
 * Lab 1: Akash Sharma, Amjed Hallak, William Starcher, Adam Tran, Matt Billone
 *
 */
public class RetirementPlanner 
{

	private static double numberOfYears; //Variable declaration
	private static double AnnualReturn;
	private static double RetiredYears;
	private static double AnnualRetirment;
	private static double RequiredIncome;
	private static double MonthlySSIncome;
	private static double TotalSaving;
	private static double SaveMonthly;
	
	public static void main(String[] args) 
	{
		
		UserInput();
		TotalSavingCalculator(RequiredIncome, MonthlySSIncome, AnnualRetirment, RetiredYears, AnnualReturn);
		MonthlySavingCalculator(TotalSaving, AnnualReturn, numberOfYears);
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		System.out.println("In order to achieve your retirement goals you need to save: " + defaultFormat.format(SaveMonthly) + " each month and have a total of: " +  defaultFormat.format(TotalSaving) + " saved by retirement");
	}
	public static void UserInput() //Collects input from user for filling in the variables
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number of years left to work:");
		numberOfYears = input.nextDouble();
		
		System.out.println("Enter your annual return percentage based on investments (Range must be between 0 and 20)");
		AnnualReturn = input.nextDouble();
		
		while((AnnualReturn < 0) || (AnnualReturn > 20))
		{
			System.out.println("Invalid input. Enter your annual return percentage based on investments (Range must be between 0 and 20)");
			AnnualReturn = input.nextDouble();
		}	

		System.out.println("Enter your number of years you plan to retire:");
		RetiredYears = input.nextDouble();
		
		System.out.println("Enter your annual return percentage in payback mode (Range must be between 0 and 3)");
		AnnualRetirment = input.nextDouble();
		while((AnnualRetirment < 0) || (AnnualRetirment > 3))
		{
			System.out.println("Invalid input. Enter your annual return percentage in payback mode (Range must be between 0 and 3)");
			AnnualRetirment = input.nextDouble();
		}	
		
		System.out.println("Enter your monthley required income for retirement:");
		RequiredIncome = input.nextDouble();
		
		System.out.println("Enter your monthley social security income for retirement:");
		MonthlySSIncome = input.nextDouble();
		
		input.close();
		
	}
	
	private static double TotalSavingCalculator(double RequiredIncome, double MonthlySSIncome, double AnnualRetirment,double RetiredYears, double AnnualReturn)
	{ //Calculations
		RetirementPlanner.RequiredIncome = RequiredIncome;
		RetirementPlanner.MonthlySSIncome = MonthlySSIncome;
		RetirementPlanner.AnnualRetirment = AnnualRetirment;
		RetirementPlanner.RetiredYears = RetiredYears;
		RetirementPlanner.AnnualReturn = AnnualReturn;
		
		TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirment/100)/12,RetiredYears*12 )))))/((AnnualRetirment/100)/12);
        return TotalSaving;
        
	}
	
	private static double MonthlySavingCalculator(double TotalSaving, double AnnualReturn, double numberOfYears)
	{ //More calculations
		RetirementPlanner.TotalSaving = TotalSaving;
		RetirementPlanner.AnnualReturn = AnnualReturn;
		RetirementPlanner.numberOfYears = numberOfYears;
		
		SaveMonthly = TotalSaving*(((AnnualReturn/100)/12)/((Math.pow(1+(AnnualReturn/100)/12, numberOfYears*12))-1));	
        return SaveMonthly;
	}
	

}
