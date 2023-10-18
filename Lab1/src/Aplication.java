import java.util.Scanner;

public class Aplication {
	public static void main(String[] arqs) {
		System.out.println("Hello World!");
		
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		
		System.out.println("Hello " + userName + "! Nice to meet you");
	}
}
