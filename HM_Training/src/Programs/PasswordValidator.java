package Programs;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		String s = sc.nextLine();
		char c[] = new char[s.length()];
		boolean flag = false, flag1 = false, flag2 = false, flag3 = false, flag4 = false;
		int count=0,count1=0,count2=0,count3=3,count4=0;
		for (int i = 0; i <= s.length() - 1; i++) {
			c[i] = s.charAt(i);
			if (c[i] >= 65 && c[i] <= 90) {
				flag = true;
				count++;
			}
			if (c[i] >= 97 && c[i] <= 122) {
				flag1 = true;
				count1++;
			}
			if (c[i] >= 48 && c[i] <= 57) {
				flag2 = true;
				count2++;
			}
			if (c[i] >= 33 && c[i] >= 47) {
				flag3 = true;
				count3++;
			}
			if (c.length > 8) {
				flag4 = true;
			}
		}
		if (flag && flag1 && flag2 && flag3 && flag4) {
			if(c.length>=12&&count2>=3&&count1>=5&&count>=2){
			System.out.println("password strength is strong");
			}else if(c.length>=10){
				System.out.println("password strength is Normal");
			}
			else{
				System.out.println("Password strength is weak");
			}
		} else {
			System.out.println("please enter a valid password");
		}
		sc.close();
	}
}
//Output
//Enter the Password
//Kbhuvan@1
//Password strength is weak