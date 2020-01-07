package Programs;

import java.util.Scanner;

public class PrintUniqueDigitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc  = new Scanner(System.in);
System.out.println("Enter the first number");
int num1 = sc.nextInt();
System.out.println("Enter the second number");
int num2 = sc.nextInt();
for(int i=num1;i<=num2;i++){
	boolean flag=false;
	int num3 = i,count = 0,num4 = 0;
	while(num3>0){
		num4=num3%10;
		num3=num3/10;
		count++;
	}
	int mat[] = new int[count];
	num3=i;num4=0;
	for(int l=0;l<mat.length;l++){
		num4=num3%10;
		mat[l]=num4;
		num3=num3/10;
	}
	for(int j=0;j<mat.length;j++){
		for(int k=j+1;k<mat.length;k++){
			if(mat[j]==mat[k]){
				flag=true;
			}
		}
	}
	if(flag==false){
		System.out.println(i);
	}
}
	}

}
//Output
//Enter the first number
//121
//Enter the second number
//125
//123
//124
//125