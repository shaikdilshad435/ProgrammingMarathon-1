import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of inch");
		double inches=scan.nextDouble();
		HeightConverter converter = new HeightConverter();

		System.out.printf("%.2f",converter.convertInchesToFeet(inches));

	}

}