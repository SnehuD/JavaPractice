package basicSyntaxAndOutputs;
import java.util.*;

public class PrintNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {	// i=1  n=5 
			System.out.println(i);		// 1 2 3 4 5 
		}
		
		sc.close();
	}

}
