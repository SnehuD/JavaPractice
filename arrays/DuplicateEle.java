package arrays;
import java.util.*;

public class DuplicateEle {

	public static void main(String[] args) {
		// Find duplicate elements in array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Duplicate array elements : ");
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
        
		sc.close();

	}

}
