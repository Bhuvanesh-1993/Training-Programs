package Programs;

import java.util.Scanner;

public class ContinuousSubArray {
//input: {4,5,8,9,23,6,8,2,1}
//input number - 11
//output - {8,2,1}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int a = sc.nextInt();
int arr[] = new int[a];
int arr1[] = new int[a];
int sum=0,num=0;
System.out.println("Enter the elements present in the array");
for(int i=0;i<arr.length;i++){
	arr[i] = sc.nextInt();
}
System.out.println("Enter the number");
int number = sc.nextInt();
first:for(int i=0;i<arr.length;i++){
	for(int k=i;k<arr.length;k++){
	sum=sum+arr[k];
//	System.out.println(sum+"sum");
	arr1[k]=arr[k];
	if(sum==number){
		for(int j=i;j<=k;j++)
		{
			System.out.println(arr1[j]);
		}
    break first;
		}
	}
	sum=0;
	}

}

	}