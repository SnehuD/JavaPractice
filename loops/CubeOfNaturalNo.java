package loops;

public class CubeOfNaturalNo {

	public static void main(String[] args) {
		// Print the cube of the first 10 natural numbers.
		
		for(int i = 1; i <= 10; i++) {
			int num = i * i * i;
			System.out.println("Cube of " + i + " is "+ num);
		}

	}

}
