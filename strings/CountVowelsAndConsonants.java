package strings;
import java.util.*;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// Count vowels and consonants in a string
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		
		int v = 0, c = 0;
		
		 for(int i = 0; i < str.length(); i++)
		 {
			 char ch = str.charAt(i);
			 if(ch >= 'a' && ch <= 'z')
			 {
				 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				 {
					 v++;
				 }
				 else
				 {
					 c++;
				 }
			 }
		 }
		 
		 System.out.println("Vovels " +v);
		 System.out.println("Consonents " +c);
		 
		 sc.close();
		 
	}

}
