package arrays;

import java.util.Scanner;

public class EvenUserArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want in array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even numbers in the array : ");
		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		sc.close();

	}

}
