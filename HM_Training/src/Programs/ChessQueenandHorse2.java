package Programs;



import java.util.Scanner;

public class ChessQueenandHorse2 {

	public static void main(String[] args) {
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
			if(((a+b)==(c+d))||((c-d)==(a-b))||(((i==a)||(j==b))&&((c==a)||(d==b)))){
				flag=true;
				break;
			}
			}
		}
		if(flag==true){
			System.out.println("Cut");
		}
		else{
			System.out.println("Not cut");
		}
}}
//Output
//Enter the row value of Queen
//3
//Enter the Column value of Queen
//3
//Enter the row value of Horse
//4
//Enter the Column value of Horse
//5
//Not cut