package strings;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// Check if string is palindrome
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String s = sc.next();
		
		String rev = "";
		
		for(int i = s.length() - 1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
		
		sc.close();

	}

}
