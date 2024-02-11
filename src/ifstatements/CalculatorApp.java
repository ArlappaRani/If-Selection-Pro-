package ifstatements;
import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first value");
		double Value1=scan.nextDouble();
		System.out.println("Enter the second value");
		double Value2=scan.nextDouble();
		System.out.println("Enter the operation to be performed");
		char operation=scan.next().charAt(0);
		Calculator.FindCalculator(Value1,Value2,operation);

	}

}
