package conditionalsAndLoops;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// Check if a number is palindrome
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		int og = n;
		int rev = 0;
		
		while(n > 0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		
		
		if(og == rev) 
		{
			System.out.println("Its a Palindrome Number");
		}
		else
		{
			System.out.println("Its not a Palindrome Number");
		}
		
		sc.close();

	}

}
