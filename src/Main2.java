import java.util.Scanner;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("What the time is it?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Good morning!");
		}
		
		else {
			if (hora < 18) {
				System.out.println("Good afternoon!");
			}
			else {
				System.out.println("Good evening!");
			}
		}
		

	}

}
