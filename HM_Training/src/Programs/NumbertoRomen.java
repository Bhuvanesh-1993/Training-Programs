package Programs;

import java.util.Scanner;

public class NumbertoRomen {

	String value(int num) {

		String m[] = { "", "M", "MM", "MMM" };
		String c[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String x[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String i[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String thousands = m[num / 1000];
		String hundreds = c[(num % 1000) / 100];
		String tens = x[(num % 100) / 10];
		String once = i[(num % 10)];

		String answer = thousands + hundreds + tens + once;

		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = sc.nextInt();
		NumbertoRomen nr = new NumbertoRomen();
		String a = nr.value(i);
		System.out.println("Equalent romen letter for the given number is :" + " " + a);
	}

}