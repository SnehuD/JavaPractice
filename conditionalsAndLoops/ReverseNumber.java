package conditionalsAndLoops;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// Reverse a number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int rev = 0;
		
		while(n > 0)
		{
			int lastDig = n % 10;
			rev = rev * 10 + lastDig;
			n = n / 10;
		}
		
		System.out.println(rev);
		
		sc.close();
		
	}

}
