package conditionalsAndLoops;
import java.util.*;

public class MultiTable {

	public static void main(String[] args) {
		// Print multiplication table of a number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		
		System.out.println("Multiplication Table is : ");
		
		for(int i = 1; i<=10; ++i)
		{
			//mul = num * i;
			System.out.println(+ num + " * " + i + " = " + num * i);
		}
		
		sc.close();

	}

}
