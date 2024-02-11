package ifstatements;
import java.util.Scanner;
public class MarksApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the marks of student");
		int Score=scan.nextInt();
		Marks.Techclub(Score);

	}

}
