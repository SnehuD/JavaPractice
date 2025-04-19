package strings;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		sc.close();

	}

}
