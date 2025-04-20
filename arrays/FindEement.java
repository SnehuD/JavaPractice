package arrays;
import java.util.*;

public class FindEement {

	public static void main(String[] args) {
		// Find largest and smallest element in array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many element do you want in array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0], max = arr[0];
		
		for(int i = 1; i < n; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
		}
		
		System.out.println("Smallest element in array : " + min);
		System.out.println("Largest element in array : " + max);
		
		sc.close();

	}

}
