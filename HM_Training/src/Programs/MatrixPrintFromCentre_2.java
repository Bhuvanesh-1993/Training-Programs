package Programs;

import java.util.Scanner;

public class MatrixPrintFromCentre_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = sc.nextInt();
		System.out.println("Enter the number of columns");
		int n = sc.nextInt();
		int k = 0, l = 0, value = 1;
		int a[][] = new int[m][n];
		System.out.println("Your matrix is");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print((a[i][j] = value++) + " ");
			}
			System.out.println(" ");
		}
		int arr[] = new int[m * n];
		int x = 0;
		System.out.println("Your Output is");
		while (k < m && l < n) {
			for (int i = l; i < n; ++i) {
				arr[x] = a[k][i];
				x++;
				
			}
			k++;
			for (int i = k; i < m; ++i) {
				arr[x] = a[i][n - 1];
				x++;
			}
			n--;
			if (k < m) {
				for (int i = n - 1; i >= l; --i) {
					arr[x] = a[m - 1][i];
					x++;
				}
				m--;
			}
			if (l < n) {
				for (int i = m - 1; i >= k; --i) {
					arr[x] = a[i][l];
					x++;
				}
				l++;
			}
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
//Enter the number of rows
//3
//Enter the number of columns
//3
//Your matrix is
//1 2 3  
//4 5 6  
//7 8 9  
//Your Output is
//5 4 7 8 9 6 3 2 1 