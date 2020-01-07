package Programs;

import java.util.Scanner;

public class FindTopFrequent2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Paragraph");
		String[] arr = sc.nextLine().split("[, ?.@]");
		int count = 1,highest = 0,c=0,count1=0;
		String str1 = null;
		String str2,string = "";
		String a[] = new String[arr.length];
		int b[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				str1 = arr[i];
				str2 = arr[j];
				if (str1.equalsIgnoreCase(str2)) {
					count++;
					arr[j] = "*";
				}
			}
			a[i] = str1;
			b[i] = count;
		}
		while(count1<5){
		for(int i=0;i<b.length;i++){
				
		{		if(a[i]!="*"){
			if(highest<b[i]){
				highest = b[i];
				c=i;
			}
			}
		}
		}//for(int i=0;i<a.length;i++){
		if(string!=(a[c])&&b[c]!=1)
			System.out.println(a[c]+" is "+b[c]+" times");
			count1++;
			string=a[c];
			b[c]=0;
			highest=0;
		//}
		}		
	}
		 	        	}