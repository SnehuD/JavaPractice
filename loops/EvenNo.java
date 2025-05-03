package loops;

public class EvenNo {

	public static void main(String[] args) {
		// Print all even numbers from 2 to 100.
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
