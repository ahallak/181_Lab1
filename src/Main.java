import java.util.Scanner;
// SPLIT THIS INTO FOUR FUNCTIONS!! two for calculations, one for user input, one for ???
public class Main {
	public static void main(String[] args) { //main method
		
		int investmentAnnualReturn;
		int yearsRetired;
		int yearsToWork;
		int paybackAnnualReturn;
		int requiredIncome;
		int monthlySSI;
		
		Scanner input = new Scanner(System.in); //this allows user input mechanisms to work
		System.out.println("Enter your amount of years left to work: ");
		yearsToWork = input.nextInt(); //creates input field for user
		System.out.println("Enter your annual return percentage based on investments (Range must be between 0 and 20): ");
		investmentAnnualReturn = input.nextInt();
		while((investmentAnnualReturn < 0) || (investmentAnnualReturn > 20)) //input testing
		{
			System.out.println("Invalid input. Enter your annual return percentage based on investments (Range must be between 0 and 20): ");
			investmentAnnualReturn = input.nextInt();
		}
		System.out.println(investmentAnnualReturn);
		System.out.println("Enter your number of years retired: ");
		yearsRetired = input.nextInt();
		System.out.println("Enter your annual return percentage for payback (Range must be between 0 and 3): ");
		paybackAnnualReturn = input.nextInt();
		while((paybackAnnualReturn < 0) || (paybackAnnualReturn > 3))
		{
			System.out.println("Invalid input. Enter your annual return percentage for payback (Range must be between 0 and 3): ");
			paybackAnnualReturn = input.nextInt();
		}
		System.out.println("Enter your required income: ");
		requiredIncome = input.nextInt();
		System.out.println("Enter your monthly SSI");
		monthlySSI = input.nextInt();
	}

}
