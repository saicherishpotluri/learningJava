import java.util.Scanner;
public class apples {
	public static void main(String args[]) {
		System.out.println("Multiple classes with multiple instances");
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a name: ");
//		String temp = input.nextLine();
		
		berries gf1 = new berries("Ana de Armas");
		berries gf2 = new berries("Monica Bellucci");
//		gf1.setName(temp);
		gf1.sayings();
		gf2.sayings(); 
	}
}
