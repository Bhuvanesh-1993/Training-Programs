package tasks;

import java.util.Scanner;

public class WaterStorageCalculation {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of blocks");
		int num1 = sc.nextInt();
		int highest = 0, sum = 0, sum1 = 0, highest1 = 0, highest2 = 0;
		int secondhighest = 1;
		int a = 0, b = 0, s = 0, s1 = 0, c = 0, d = 0;
		int arr[] = new int[num1];
		boolean flag = false;
		System.out.println("Enter the size of each block");
		for (int i = 0; i < num1; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = a; i < arr.length; i++) {
//	for(int j=b;j<arr.length;j++){
			{
//	if(i!=j){		
				if (highest < arr[i]) {
					secondhighest = highest;
					highest = arr[i];
					a = i;
				} else if (secondhighest < arr[i]) {
					secondhighest = arr[i];
					if (secondhighest == arr[i]) {
						b = i;
						flag = true;
					}
				}
//		}
//	}
			}
		}
		if (flag == false) {
			b = arr.length - 2;
		}
		System.out.println("first highest" + " " + highest + "secondhighest" + " " + secondhighest);
		s = secondhighest * Math.abs((b - a + 1));
		System.out.println("a and b value for 1st output " + a + "and" + b + "S value is" + s);
		for (int i = a + 1; i <= b; i++) {
			sum = sum + arr[i];
		}
		sum = sum + arr[b];
		s1 = s - sum;
		sum1 = sum1 + s1;
		System.out.println("1st Loop output" + sum1);
		if (a > 0) {
			sum = 0;
			s = 0;
			for (int i = a; i >= 0; i--) {
				for (int j = i - 1; j >= 0; j--) {
					if (arr[i] < arr[j]) {
						secondhighest = arr[j];
						b = j;
					}
				}

			}
			System.out.println("a and b value for 2nd output " + a + "and" + b);
			s = secondhighest * (b - a + 1);
			for (int i = a + 1; i <= c; i++) {
				sum = sum + arr[i];
			}
			sum = sum + arr[b];
			sum1 = sum1 + s1;
			System.out.println("2nd loop output" + sum1);
		}
//System.out.println(s +"and"+a+"and"+ b);
		s1 = 0;
		sum = 0;
		s = 0;
		System.out.println("b" + " " + b);
		if (b < arr.length) {
			for (int i = b + 1; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] < arr[j]) {
						if (arr[i] < arr[j]) {
							secondhighest = arr[j];
							b = j;
						}
					}
				}

			}
			s = secondhighest * (b - a + 1);
			for (int i = a + 1; i <= b; i++) {
				sum = sum + arr[i];
			}
			sum = sum + arr[b];
			s1 = s - sum;

			System.out.println("a and b value for 3rd output " + a + "and" + b);
			sum1 = sum1 + s1;
			System.out.println("3rd output" + sum1);
		}
		System.out.println("Final output" + sum1);
	}
}


