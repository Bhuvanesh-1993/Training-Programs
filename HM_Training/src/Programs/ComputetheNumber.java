package Programs;

import java.util.Scanner;

public class ComputetheNumber {

	// Input: 3456
	// Output: 3^4+4^5+5^6+6^3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		int num2 = num;
		//Check the number of digit
		while (num2 > 0) {
			count++;
			num2 = num2 / 10;
		}
		//Create an array with the size of no.of digits
		//Apply the given calculation condition 
		int[] arr = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			int num3 = num % 10;
			arr[i] = num3;
			num = num / 10;
		}
		for (int i = 0; i < count; i++) {
			if (i + 1 < arr.length) {
				int d = (int) Math.pow(arr[i], arr[i + 1]);
				sum = sum + d;
			} else 
			{
				int e = (int) Math.pow(arr[i], arr[0]);
				sum = sum + e;
			}
		}
		System.out.println("Result of the given number is : " + sum);
	}
}