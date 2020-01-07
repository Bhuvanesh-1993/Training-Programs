package Programs;

import java.util.Scanner;

public class RomenToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the romen letter");
		String s = sc.next();
		RomenToNumber rm = new RomenToNumber();
		int a = rm.convertion(s);
		System.out.println("Equalent number for given romen letter is :" + " " + a);
	}

	int value(char a) {
		if (a == 'I') {
			return a = 1;
		}
		if (a == 'V') {
			return a = 5;
		}
		if (a == 'X') {
			return a = 10;
		}
		if (a == 'L') {
			return a = 50;
		}
		if (a == 'C') {
			return a = 100;
		}
		if (a == 'D') {
			return a = 500;
		}
		if (a == 'M') {
			return a = 1000;
		}
		return a;

	}

	int convertion(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int c1 = value(s.charAt(i));
			if (i + 1 < s.length()) {
				int c2 = value(s.charAt(i + 1));
				if (c1 >= c2) {
					sum = sum + c1;
				} else {
					sum = sum + c2 - c1;
					i++;
				}
			} else {
				sum = sum + c1;
			}
		}
		return sum;

	}

}