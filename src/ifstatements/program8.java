package ifstatements;
import java.util.Scanner;
public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the larger Number");
		int a=scan.nextInt();
		System.out.println("Enter the smaller Number");
		int b=scan.nextInt();
		
		if(a-b>0)
		{
			System.out.println("positive Number");
		}
		else
		{
			System.out.println("Negative Number");
		}
		

	}

}
