import java.util.Random;

public class randomNumGen {
	public static void main(String args[]) {
		Random dice = new Random();
		int number;
		
		for (int counter = 1; counter <= 10; counter++) {
			 number = dice.nextInt(1,7);
			 System.out.println(number + " ");
		}
	}
}
