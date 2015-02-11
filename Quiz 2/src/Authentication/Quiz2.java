package Authentication;

import java.util.Scanner;

public class Quiz2 {

	static String username = "moneymike";
	static String password = "csc201";

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter username");
		String name = keyboard.next();
		System.out.println("Please enter password");
		String pass = keyboard.next();
		System.out.println(authentication(name, pass));

	}

	public static String authentication(String a, String b) {
		
		if (username.equals(a) && password.equals(b))
			return ("Welcome " + a + ".");

		else
			return "Wrong username or password!";

	}

}
