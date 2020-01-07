package tasks;

import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		int answer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value of n X n matrix");
		int n = sc.nextInt();
		if (n % 2 != 0) {
		oddMagicSquare(n);
		} else if (n % 2 == 0 && n % 4 == 0) 
		{
		doublyEvenSquare(n);
		} 
		else if(n % 2 == 0 && n % 4 != 0) 
		{
		 singlyEven(n);
		}
		if(n % 2 != 0)
		{
		for(int[] row:oddMagicSquare(n) ){
			for(int x : row){
				System.out.print(x+" ");
					}
			System.out.println();
		}
		}
	    if (n % 2 == 0 && n % 4 == 0) 
					for(int[] row:doublyEvenSquare(n)){
						for(int x : row){
							System.out.print(x+" ");
								}
						System.out.println();
					}				
	    if(n % 2 == 0 && n % 4 != 0) 
					for(int[] row:singlyEven(n)){
						for(int x : row){
							System.out.print(x+" ");
								}
						System.out.println();
					}
	    System.out.println("The Magic Number is: "+(n*n+1)*n/2);
			}	
	private static int[][] singlyEven(int n){
	   	    int size = n * n;
	        int halfN = n / 2;
	        int subSquareSize = size / 4;
	 
	        int[][] subSquare = oddMagicSquare(halfN);
	        int[] quadrantFactors = {0, 2, 3, 1};
	        int[][] result = new int[n][n];
	 
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                int quadrant = (i / halfN) * 2 + (j / halfN);
	                result[i][j] = subSquare[i % halfN][j % halfN];
	                result[i][j] += quadrantFactors[quadrant] * subSquareSize;
	            }
	        }
	 
	        int nColsLeft = halfN / 2;
	        int nColsRight = nColsLeft - 1;
	 
	        for (int i = 0; i < halfN; i++)
	            for (int j = 0; j < n; j++) {
	                if (j < nColsLeft || j >= n - nColsRight
	                        || (j == nColsLeft && i == nColsLeft)) {
	 
	                    if (j == 0 && i == nColsLeft)
	                        continue;
	 
	                    int tmp = result[i][j];
	                    result[i][j] = result[i + halfN][j];
	                    result[i + halfN][j] = tmp;
	                }
	            }
	 
	        return result;
	    }

public static int[][] doublyEvenSquare(int n) 
	{
	    { 
	        int[][] arr = new int[n][n]; 
	        int i, j,num=1; 
	        for ( i = 0; i < n; i++) 
	        {
	            for ( j = 0; j < n; j++)
	            { 
	                arr[i][j] = num; 
	                num++;
	            }
	        } 
	        for ( i = 0; i < n/4; i++)
	        {
	            for ( j = 0; j < n/4; j++) 
	            { 
	                arr[i][j] = (n*n + 1) - arr[i][j]; 
	            }
	         }
	        for ( i = 0; i < n/4; i++)
	        {
	            for ( j = 3 * (n/4); j < n; j++) 
	            {
	                arr[i][j] = (n*n + 1) - arr[i][j]; 
	            }
	        }  
	        for ( i = 3 * n/4; i < n; i++) 
	        {
	            for ( j = 0; j < n/4; j++)
	            {
	                arr[i][j] = (n*n+1) - arr[i][j]; 
	            }
	        } 
	        for ( i = 3 * n/4; i < n; i++) 
	        {
	            for ( j = 3 * n/4; j < n; j++)
	            {
	                arr[i][j] = (n*n + 1) - arr[i][j]; 
	            }
	        }
	        for ( i = n/4; i < 3 * n/4; i++)
	        {
	            for ( j = n/4; j < 3 * n/4; j++) 
	            {
	                arr[i][j] = (n*n + 1) - arr[i][j];
	            }
	        }
		return arr; 
	}
	}
	static int[][] oddMagicSquare(int n) 
	{ 
		int[][] magicSquare = new int[n][n]; 	
		int i = n/2; 
		int j = n-1; 
		for (int num=1; num <= n*n; ) 
		{ 
			if (i==-1 && j==n)
			{ 
				j = n-2; 
				i = 0; 
			} 
			else
			{ 
 
				if (j == n) { 
					j = 0; 
				}
 
				if (i < 0) { 
					i=n-1; 
				}
			} 
			
			if (magicSquare[i][j] != 0) 
			{ 
				j -= 2; 
				i++; 
				continue; 
			} 
			else
				magicSquare[i][j] = num++; 
			j++; i--; 
		} 
		return magicSquare;
	} 
}
