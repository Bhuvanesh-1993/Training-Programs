package Programs;

import java.util.Scanner;

public class ComputetheString {

	/*
	 * Input : a2b10cf4
	 * Output : aabbbbbbbbbbcfcfcfcf
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String s = sc.nextLine();
		int a=0;
		while(a<s.length()){
			//Separate the string into char
		for (int i = a; i < s.length(); i++) {
			char c1 = s.charAt(i);
			//If the char is an alphabet, it satisfies below condition
			if (c1 >= 97 && c1 <= 122 || c1 <= 90 && c1 >= 65) {
				str = (String) (str + c1);
				a++;
			}
			////If the char is an numeric, It satisfies the below condition
			else{
				num = (int)(num*10+(c1-48));
				a++;
				if(i+1<s.length()){
					char c2 = s.charAt(i+1);
				if(c2 >= 97 && c2 <= 122 || c2 <= 90 && c2 >= 65){
					break;
				}
				}
			}
		}
		//Print the char
		while(num>0){
			System.out.print(str);
			num--;
		}
		
		str = "";
		num = 0;
	}

}
	
}