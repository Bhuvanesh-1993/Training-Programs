package Programs;

import java.util.Scanner;

public class ChessQueenandHorse {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value of Queen");
		int a = sc.nextInt();
		System.out.println("Enter the Column value of Queen");
		int b = sc.nextInt();
		System.out.println("Enter the row value of Horse");
		int c = sc.nextInt();
		System.out.println("Enter the Column value of Horse");
		int d = sc.nextInt();
		int m = 8, n = 8;
		boolean flag = false;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if( (i == a || j == b)&& (c == a || d == b)){
						flag=true;
						break;
				}
			}
		}
		int x=a,y=b;
				while(x<=m-1&&y<=n-1) {
					if (x == c && y == d) {
						flag=true;
					}
					x++;y++;
				}
		int x1=a,y1=b;
				while(x1>=0&&y1>=0) {
					if (x1 == c && y1 == d) {
						flag=true;
					}
					x1--;y1--;
				}
		int x2=a,y2=b;
				while(x2<=m-1&&y2>=0) {
					if (x2 == c && y2 == d) {
						flag=true;
					}
					x2++;y2--;
				}
		int x3=a,y3=b;
	          while(x3>=0||y3<=n-1) {

					if (x3 == c && y3 == d) {
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

