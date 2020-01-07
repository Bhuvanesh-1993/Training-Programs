package Programs;

import java.util.Scanner;

public class TrianglePrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int num = sc.nextInt();
int a = num,num1=num;
for(int i=0;i<num;i++){
	for(int j=num;j>i;j--){
		System.out.print("  ");
	}int b=num1;
	for(int j=0;j<i;j++){
		System.out.print(b+" ");
		b++;
	}
	num1--;
	for(int j=0;j<=i;j++){
		System.out.print(a+" ");
		a--;
	}
		for(int k=num;k>i;k--){
			System.out.print("  ");
		}
	System.out.println();
	a=num;	
}
	} 

}

//Output:
//Enter the number
//10
//                    10                     
//                  9 10 9                   
//                8 9 10 9 8                 
//              7 8 9 10 9 8 7               
//            6 7 8 9 10 9 8 7 6             
//          5 6 7 8 9 10 9 8 7 6 5           
//        4 5 6 7 8 9 10 9 8 7 6 5 4         
//      3 4 5 6 7 8 9 10 9 8 7 6 5 4 3       
//    2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2     
//  1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1  