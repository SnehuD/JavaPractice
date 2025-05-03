package arrays;

import java.util.Scanner;

public class OddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {	//0 1 2...
			arr[i] = i +1;				//1 2 3..
		}
		
		for(int i = 0; i < n; i++) {	//0 1 2 4 5....
			if(arr[i] % 2 != 0) {		//1  3  5...
				System.out.println(arr[i] + " ");
			}
		}
		
		sc.close();

	}

}
