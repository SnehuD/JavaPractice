package basicSyntaxAndOutputs;
import java.util.*;

public class PrintPersonalDetails {

	public static void main(String[] args) {
		//Print your name, age, and address
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Your name is : " + name);
		System.out.println();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Your age is : " + age);
		System.out.println();
		
		System.out.println("Enter your address : ");
		String addr = sc.next();
		System.out.println("Your address is : " + addr);
		
		sc.close();
	}

}
