package conditionalsAndLoops;
import java.util.*;

public class leapYear {

	public static void main(String[] args) {
		// Check if year is a leap year
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		int y = sc.nextInt();
		
		if(y % 400 == 0)
		{
			System.out.println("Its a leap year");
		}
		else if(y % 100 == 0)
		{
			System.out.println("Its not a leap year");
		}
		else if(y % 4 == 0)
		{
			System.out.println("Its a leap year");
		}
		else
		{
			System.out.println("Its not a leap year");
		}
		
		sc.close();

	}

}
