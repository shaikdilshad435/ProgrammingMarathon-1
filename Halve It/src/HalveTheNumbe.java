import java.util.Scanner;

public class HalveTheNumbe {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		double num=scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
	}
	public static double halveTheNumber(double num) {
		return num/2;
	}
}
