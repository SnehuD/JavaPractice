package strings;
import java.util.*;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// Find duplicate characters in a string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		int[] freq = new int[26];
		// For 'a' to 'z'
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				freq[ch - 'a']++;
				// Count frequency
			}
		}
		
		System.out.println("Duplicate characters : ");
		for(int i = 0; i < 26; i++)
		{
			if(freq[i] > 1)
			{
				System.out.println((char) (i + 'a') + " -> " + freq[i]);
			}
		}

		sc.close();

	}

}
