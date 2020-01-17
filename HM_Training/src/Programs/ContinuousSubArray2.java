package Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuousSubArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: {4,5,8,9,23,6,8,2,1}
		//input number - 11
		//output - {8,2,1}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = sc.nextInt();
		int arr[] = new int[a];
		int sum=0,num=0;
		System.out.println("Enter the elements present in the array");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number");
		int number = sc.nextInt();
		//Without creating another array, we can get the number through Array list
		ArrayList<Integer> al = new ArrayList<Integer>();
		first:for(int i=0;i<arr.length;i++){
			for(int k=i;k<arr.length;k++){
			sum=sum+arr[k];
			//If sum value is more then 11, below condition break the loop, It increase the time complexity of the program
			if(sum>11) {
				break;
			}
			al.add(arr[k]);
				if(number==sum)
				{
					break first;
					}
			}
			sum=0;
			//Already saved elements delete from array list for next hydration 
			al.removeAll(al);
	}
		System.out.println("SubArray, which sum is equal to the given number:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
}
}