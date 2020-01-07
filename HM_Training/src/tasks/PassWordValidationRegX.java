package tasks;

import java.util.Scanner;
import java.util.regex.*;

public class PassWordValidationRegX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the password");
		String s = sc.next();sc.close();
		boolean flag = Pattern.compile("(?=.*[A-Z])(?=.*[!@#$%^&*])(?=.*[0-9])(?=.*[a-z]).{8,}").matcher(s).matches();
if(flag) {
	System.out.println("Valid Password");
}
else {
	System.out.println("Not a valid Password");
}

	}
}

