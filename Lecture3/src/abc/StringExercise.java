package abc;
import java.util.Scanner;

public class StringExercise {
	Scanner sc = new Scanner(System.in);
	
	public void ChangeCase() {
		//systemout goes here
		String word = sc.next();
		
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
	}
}
