package Programs;



import java.util.Scanner;

public class ChessQueenandHorse2 {

	public static void main(String[] args) {
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
		//Addition of row and column value of queen is equals to addition of row and column value of horse
		//Difference between the row and column value is equals to difference between the row and column value of horse
		//column value or row value of queen is equals to column or row value of horse
			if(((Queen_Row+Queen_Column)==(Horse_Row+Horse_Column))||((Horse_Row-Horse_Column)==(Queen_Row-Queen_Column))||((Horse_Row==Queen_Row)||(Horse_Column==Queen_Column)))
			{
				flag=true;
			}
		if(flag==true){
			System.out.println("Cut");
		}
		else{
			System.out.println("Not cut");
		}
}
	}
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

