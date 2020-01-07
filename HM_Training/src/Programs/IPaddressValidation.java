package Programs;

import java.util.Scanner;

public class IPaddressValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the IP address");
		int count = 0, count1 = 0;
		String s = sc.next();
		String s1[] = s.split("[. ]");
		for (int j = 0; j < s.length(); j++) {
			char s3 = s.charAt(j);
			if (s3 == 46) {
				count1++;
			}
		}
		if (count1 == 3) {
			for (int i = 0; i < s1.length; i++) {
				String s2 = s1[i];
				int n = Integer.parseInt(s2);
				if (n < 256) {
					count++;
				}
			}
			if (count == 4) {
				System.out.println("It is an Valid IP");
			} else {
				System.out.println("Not an valid IP address");
			}
		} else {
			System.out.println("Not an valid IP address");
		}
	}
}

//Enter the IP address
//192.168.1.21
//It is an Valid IP