package strings;
import java.util.*;

public class CompareTwoStrings {

	public static void main(String[] args) {
		// Compare two strings without using .equals()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first String : ");
		String s1 = sc.next();
		
		System.out.println("Enter second String");
		String s2 = sc.next();
		
		boolean isEqual = true;
		
		if(s1.length() != s2.length())
		{
			isEqual = false;
		}
		else
		{
			for(int i = 0; i < s1.length(); i++)
			{
				if(s1.charAt(i) != s2.charAt(i))
				{
					isEqual = false;
					break;
				}
			}
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Same Strings");
		}
		else
		{
			System.out.println("Strings are not same");
		}
		
		sc.close();
	}

}
