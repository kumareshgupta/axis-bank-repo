import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		String name ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name :- ");
		//name = scanner.next();
		name = scanner.nextLine();
		System.out.println("Your name is " + name);
		int age = scanner.nextInt();
		System.out.println("Age is " +age);
	}

}
