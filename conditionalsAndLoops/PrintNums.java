package conditionalsAndLoops;
import java.util.*;

public class PrintNums {

	public static void main(String[] args) {
		// Print 1 to N using loop
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			System.out.print(i + "\t");
		}
		
		sc.close();

	}

}
