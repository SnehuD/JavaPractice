package conditionalsAndLoops;
import java.util.*;

public class SumOfdigits {

	public static void main(String[] args) {
		// Sum of digits of a number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n != 0)
		{
			sum = sum + n % 10;
			n = n / 10;
		}
		
		System.out.println("Sum of the digits in given number : " + sum);
		
		sc.close();

	}

}
