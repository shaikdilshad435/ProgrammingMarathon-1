import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter principal, rate and time ");
		double principal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));

	}

}
