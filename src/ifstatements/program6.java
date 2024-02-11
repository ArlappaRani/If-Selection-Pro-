package ifstatements;
import java.util.Scanner;
public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		/*In this program based ranges if the ranges in between 1-10 print
		 range1,else if 11-20 it print range2 like it follows up to range5
		 
		   
		 */
		if(a>=1 && a<=10)
		{
			System.out.println("Range1");
		}
		else if(a>=11 && a<=20)
		{
			System.out.println("Range2");
		}
		else if (a>=21 && a<=30)
		{
			System.out.println("Range3");
		}
		else if (a>=31 && a<=40)
		{
			System.out.println("Range4");
		}
		else
		{
			System.out.println("Range5");
		}
		
		

	}

}
