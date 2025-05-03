package loops;

public class Divby3 {

	public static void main(String[] args) {
		// Print all numbers divisible by 3 from 1 to 100.
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
