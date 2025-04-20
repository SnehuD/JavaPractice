package arrays;
import java.util.*;

public class ReverseArr {

	public static void main(String[] args) {
		// Reverse an array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reversed array is : ");
		for(int i = n-1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
