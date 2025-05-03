package practice;
import java.util.Scanner;
public class PrimeList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for(int j = 2; j <= i / 2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
