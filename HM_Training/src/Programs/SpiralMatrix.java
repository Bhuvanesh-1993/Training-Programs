package Programs;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of rows"); 
				int m=sc.nextInt();
				System.out.println("Enter the number of columns");
				int n=sc.nextInt();
				int k = 0, l = 0, value=1;
				int a[][]=new int[m][n];
				System.out.println("Your matrix is");
				for(int i=0;i<m;i++){
					for(int j=0;j<m;j++){
						System.out.print((a[i][j]=value++)+" ");
					}System.out.println(" ");
				}
				System.out.println("Your Output is");
				while (k < m && l < n) {
					for (int i = l; i < n; ++i) {
						System.out.print(a[k][i] + " ");
					}
					k++;
					for (int i = k; i < m; ++i) {
						System.out.print(a[i][n - 1] + " ");
					}
					n--;
					if (k < m) {
						for (int i = n - 1; i >= l; --i) {
							System.out.print(a[m - 1][i] + " ");
						}
						m--;
					}
					if (l < n) {
						for (int i = m - 1; i >= k; --i) {
							System.out.print(a[i][l] + " ");
						}
						l++;
					}
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
//1 2 3 6 9 8 7 4 5 