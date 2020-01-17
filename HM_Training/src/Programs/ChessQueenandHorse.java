package Programs;

import java.util.Scanner;

public class ChessQueenandHorse {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value of Queen");
		int Queen_Row = sc.nextInt();
		System.out.println("Enter the Column value of Queen");
		int Queen_Column = sc.nextInt();
		System.out.println("Enter the row value of Horse");
		int Horse_Row = sc.nextInt();
		System.out.println("Enter the Column value of Horse");
		int Horse_Column = sc.nextInt();
		int m = 8, n = 8;
		boolean flag = false;
		
		//column value or row value of queen is equals to column or row value of horse
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if( (i == Queen_Row || j == Queen_Column)&& (Horse_Row == Queen_Row || Horse_Column == Queen_Column)){
						flag=true;
						break;
				}
			}
		}
		//If both the column and row value increased simultaneously 
		int x=Queen_Row,y=Queen_Column;
				while(x<=m-1&&y<=n-1) {
					if (x == Horse_Row && y == Horse_Column) {
						flag=true;
					}
					x++;y++;
				}
		
		//If both the column and row value decreased simultaneously 
		int x1=Queen_Row,y1=Queen_Column;
				while(x1>=0&&y1>=0) {
					if (x1 == Horse_Row && y1 == Horse_Column) {
						flag=true;
					}
					x1--;y1--;
				}
				
		//If the same number is added to row value and subtracted to column value simultaneously
		int x2=Queen_Row,y2=Queen_Column;
				while(x2<=m-1&&y2>=0) {
					if (x2 == Horse_Row && y2 == Horse_Column) {
						flag=true;
					}
					x2++;y2--;
				}
		//If the same number is added to column value and subtracted to row value simultaneously
		int x3=Queen_Row,y3=Queen_Column;
	          while(x3>=0||y3<=n-1) {

					if (x3 == Horse_Row && y3 == Horse_Column) {
						flag=true;
					}
					x3--;y3++;
				}
		if(flag){
			System.out.println("Cut");
		}
		else{
			System.out.println("Not cut");
		}
	}
}
//Enter the row value of Queen
//3
//Enter the Column value of Queen
//3
//Enter the row value of Horse
//3
//Enter the Column value of Horse
//4
//Cut