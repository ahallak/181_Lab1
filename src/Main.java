import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your amount of years left to work:");
		int yearsToWork = input.nextInt();
		int investmentAnnualReturn;
		System.out.println("Enter your annual return percentage based on investments (Range must be between 0 and 20)");
		investmentAnnualReturn = input.nextInt();
		while((investmentAnnualReturn < 0) || (investmentAnnualReturn > 20)){
		System.out.println("Invalid input. Enter your annual return percentage based on investments (Range must be between 0 and 20)");
		investmentAnnualReturn = input.nextInt();
		}
		System.out.println(investmentAnnualReturn);
	}

}
