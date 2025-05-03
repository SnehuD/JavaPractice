package basicSyntaxAndOutputs;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("Not even nor odd");
		} 
		else if(num == 1) {
			System.out.println("Its odd number, start from 0 or 2");
		}
		for(int i = 2; i <= num; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
